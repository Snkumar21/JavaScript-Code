// Load products from the XML file and display on the home page
window.onload = function () {
    if (document.getElementById('product-list')) {
        loadProducts();
    }
};

// Function to load products from the XML file
function loadProducts() {
    const xhr = new XMLHttpRequest();
    xhr.open('GET', 'products.xml', true);

    xhr.onload = function () {
        if (xhr.status === 200) {
            const xml = xhr.responseXML;
            const products = xml.getElementsByTagName('product');
            const productList = document.getElementById('product-list');

            for (let i = 0; i < products.length; i++) {
                const productId = products[i].getElementsByTagName('id')[0].textContent;
                const productName = products[i].getElementsByTagName('name')[0].textContent;
                const productPrice = products[i].getElementsByTagName('price')[0].textContent;

                // Create product card
                const productDiv = document.createElement('div');
                productDiv.innerHTML = `
                    <h3>${productName}</h3>
                    <p>Price: $${productPrice}</p>
                    <a href="product-details.html?id=${productId}">View Details</a>
                `;
                productList.appendChild(productDiv);
            }
        }
    };

    xhr.send();
}

// Functionality for login and signup forms
document.addEventListener('DOMContentLoaded', function () {
    const loginForm = document.getElementById('login-form');
    const signupForm = document.getElementById('signup-form');

    if (loginForm) {
        loginForm.addEventListener('submit', function (e) {
            e.preventDefault();
            alert('Login Successful!');
        });
    }

    if (signupForm) {
        signupForm.addEventListener('submit', function (e) {
            e.preventDefault();
            alert('Signup Successful!');
        });
    }
});