const fs = require("fs");

let data = fs.readFileSync("emp.txt", "utf8").trim().split("\n");
let total = 0;

data.forEach(line => {
  let parts = line.split(":");
  total += Number(parts[3]);
});

console.log("Total Salary =", total);
