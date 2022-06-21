//Paso Por Valor | Se pasa una copia
let x = 10; //Tipo Primitivo

function cambiarValor(a){
    a = 20;
}

cambiarValor(x); //10
console.log(x);
// console.log(a); a = 20


//Paso Por Referencia | Para objetos, hace referencia al objeto
const persona = { //Objeto
    nombre: "Juan",
    apellido: "Perez"
}
console.log(persona);

function cambiarValorObjeto(p1){
    p1.nombre = 'Carlos';
    p1.apellido = 'Lara';
}

cambiarValorObjeto(persona);
console.log(persona);