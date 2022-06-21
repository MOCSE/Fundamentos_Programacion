//Tipo de dato String
var nombre = "Carlos";
console.log(nombre);

//Tipo de dato Number
var numero = 1000;
console.log(numero);

//Tipo de dato Object
var objeto = {
    nombre : "Juan",
    apellido : "Perez",
    telefono : "5523210728"
}
console.log(objeto);

//Tipo de dato Boolean
var bandera = true;
console.log(bandera);

//Tipo de dato Fuction
function miFuncion(){}
console.log(miFuncion);

//Tipo de dato Symbol | # Es Valor unico de una variable #
var simbolo = Symbol("mi simbolo");
console.log(simbolo);

//Tipo de dato clase | Tambien es una funcion
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }   
}
console.log(typeof Persona)

//Tipo de dato undefined | x = undefined
var x;
console.log(x);

//Tipo de dato Null | Ausencia de valor -> Son Tipo Object
var y = null;
console.log(y);

//Tipo de dato Empty String (Cadena vacia)
var z = "";
console.log(z);

//Arrays | Son Tipo Object
var autos = ["BMW","Audi","Volvo"];
console.log(autos);
console.log(typeof autos);



/* Variables Dinamicas | typeof ver que tipo es la variable*/
nombre = 100;
console.log(typeof nombre);

