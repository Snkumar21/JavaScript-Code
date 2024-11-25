/*for(var i = 0; i <= 15; i++){
    for(var j = 1; j <= 15; j++){
        var k = i + j;
        
        i=j;
        j=i;
        console.log(k);
    }
}*/

// Function to generate Fibonacci series
function generateFibonacci(n) {
    if (n <= 1) {
        console.log("Please enter a positive number.");
        return;
    }

    // Initializing the first two numbers of the series
    let a = 1, b = 1;

    console.log("Fibonacci Series:");
    for (let i = 1; i < n; i++) {
        console.log(a); // Print the current Fibonacci number

        // Calculate the next number in the series
        let next = a + b;

        // Swap values
        a = b;
        b = next;
    }
}