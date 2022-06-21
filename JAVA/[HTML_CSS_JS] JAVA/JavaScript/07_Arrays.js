//Forma antigua | let autos = new Array("BMW","Mercedes Benz","Volvo");

//Declarar Arreglo
const autos = ["BMW","Mercedes Benz","Volvo"];
console.log(autos);

//Acceder indice arreglo
console.log(autos[0]);
console.log(autos[1]);
console.log(autos[2]);

//Recorrer Arreglo
for (let index = 0; index < autos.length; index++) {
    console.log(index + ": " + autos[index]);
}

//Modificar Elementos de un Arreglo
autos[1] = "Jetta";
console.log(autos);

//Agregar nuevos valores al Arreglo
autos.push('Audi');
console.log(autos);

//Verificar si Es un Array
console.log(Array.isArray(autos));
console.log(autos instanceof Array);
