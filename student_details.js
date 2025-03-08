// Example of displaying student details in javascript...

let display = {
    details: function (program, year) {
        return this.name
        + " "
        + this.rollNo
        + program
        + year;
    }
} // Objects declaration

let student1 = {
    name: "Nitish",
    rollNo: "2024-M-30092002A",
}

let student2 = {
    name: "Aastha",
    rollNo: "2024-M-19102002B",
}

let x = display.details.call(student1, "MCA", " 1st year");
console.log(x);
