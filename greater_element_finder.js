// Example of finding greater element from the array index.

// LastIndexOf() method
function isGreaterThan5(element, index, array) {
    return element > 5;
}

function func() {
    //Original array
    let array = [2, 5, 8, 1, 4];

    //Checking for condition in array
    let value = array.some(isGreaterThan5);

    console.log(value);
}
func();
