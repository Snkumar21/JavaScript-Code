// Function to load XML data and display it in the table
function loadEmployeeData() {
    const xhr = new XMLHttpRequest();
    xhr.open('GET', 'employees.xml', true);
    
    xhr.onreadystatechange = function() {
        if (xhr.readyState === 4 && xhr.status === 200) {
            const xml = xhr.responseXML;
            const employees = xml.getElementsByTagName('employee');
            const tableBody = document.querySelector('#employee-table tbody');
            
            // Clear existing table rows if any
            tableBody.innerHTML = '';

            // Loop through the employees and add rows to the table
            for (let i = 0; i < employees.length; i++) {
                const id = employees[i].getElementsByTagName('id')[0].textContent;
                const name = employees[i].getElementsByTagName('name')[0].textContent;
                const position = employees[i].getElementsByTagName('position')[0].textContent;
                const department = employees[i].getElementsByTagName('department')[0].textContent;
                const salary = employees[i].getElementsByTagName('salary')[0].textContent;

                // Create a new row and insert data
                const row = document.createElement('tr');
                row.innerHTML = `
                    <td>${id}</td>
                    <td>${name}</td>
                    <td>${position}</td>
                    <td>${department}</td>
                    <td>${salary}</td>
                `;
                tableBody.appendChild(row);
            }
        }
    };

    xhr.send();
}

// Load employee data when the page is loaded
window.onload = loadEmployeeData;
