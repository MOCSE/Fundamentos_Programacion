//Se recomienda hacer conversiones para evitar inconsistencias en los tipos
let miNumero = "10";
console.log(typeof miNumero);


let edad = Number(miNumero);
console.log(typeof edad);




//Not a Number | NaN
let NoNumero = "18x";
console.log(Number(NoNumero));

//Verificar si es un NaN
console.log(isNaN(miNumero));
console.log(isNaN(NoNumero));