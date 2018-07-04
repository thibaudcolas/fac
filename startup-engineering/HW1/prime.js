#!/usr/bin/env node
var fs = require('fs');
var outfile = "prime.txt";

var numbers = [];
var i = 2;

var isPrime = function (num) {
	var result = true;
        if (num !== 2) {
            if (num % 2 == 0) {
                result = false;
            } else {
                for (x=3; x<=Math.sqrt(num); x+=2) {
                    if (num % x == 0) result = false;
                }
            }
        }
        return result;
};

while (numbers.length < 100) {
	if (isPrime(i)) numbers.push(i);
	i++;
}


var formatNumbers = function (numbers) {
	return numbers.join(',');
};

var out = formatNumbers(numbers);

fs.writeFileSync(outfile, out);  
console.log("Script: " + __filename + "\nWrote: " + out + "To: " + outfile + "Primes:" + numbers.length);
