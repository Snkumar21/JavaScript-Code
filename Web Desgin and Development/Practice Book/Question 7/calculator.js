// Function to perform calculations
function performCalculation(operation) {
    // Get the values of the input fields
    const num1 = parseFloat(document.getElementById('num1').value);
    const num2 = parseFloat(document.getElementById('num2').value);
    let result = 0;

    // Check for valid input
    if (isNaN(num1) || isNaN(num2)) {
        alert("Please enter valid numbers");
        return;
    }

    // Perform the selected operation
    switch (operation) {
        case 'add':
            result = num1 + num2;
            break;
        case 'subtract':
            result = num1 - num2;
            break;
        case 'multiply':
            result = num1 * num2;
            break;
        case 'divide':
            if (num2 === 0) {
                alert("Cannot divide by zero");
                return;
            }
            result = num1 / num2;
            break;
    }

    // Display the result
    document.getElementById('result').textContent = result;
}
