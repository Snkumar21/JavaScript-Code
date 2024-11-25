// Handling form submission and storing data in local storage
document.getElementById('user-form').addEventListener('submit', function (e) {
    e.preventDefault();

    // Getting form data
    const userInfo = {
        name: document.getElementById('name').value,
        gender: document.getElementById('gender').value,
        mobile: document.getElementById('mobile').value,
        email: document.getElementById('email').value,
        city: document.getElementById('city').value,
        state: document.getElementById('state').value,
        country: document.getElementById('country').value
    };

    // Storing data in local storage
    localStorage.setItem('userInfo', JSON.stringify(userInfo));

    // Redirecting to the display page
    window.location.href = 'display.html';
});

// Function to display user information on the display page
window.onload = function () {
    if (document.getElementById('user-info')) {
        const userInfo = JSON.parse(localStorage.getItem('userInfo'));
        if (userInfo) {
            document.getElementById('user-info').innerHTML = `
                <p><strong>Name:</strong> ${userInfo.name}</p>
                <p><strong>Gender:</strong> ${userInfo.gender}</p>
                <p><strong>Mobile Number:</strong> ${userInfo.mobile}</p>
                <p><strong>Email:</strong> ${userInfo.email}</p>
                <p><strong>City:</strong> ${userInfo.city}</p>
                <p><strong>State:</strong> ${userInfo.state}</p>
                <p><strong>Country:</strong> ${userInfo.country}</p>
            `;
        }
    }
};

// Function to go back to the form page
function goBack() {
    window.history.back();
}
