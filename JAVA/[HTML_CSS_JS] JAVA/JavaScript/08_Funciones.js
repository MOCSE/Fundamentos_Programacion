// # Hoisting #
miFuncion(102,20);

//Declaracion de funcion 
function miFuncion(a,b,c=500){
    console.log("Suma: " + (a+b+c));
}

//Llamado de funcion
miFuncion(10,20,1);

//Arumentos vs Parametros
/* 
function miFuncion(a,b)[ARGUMENTOS]{
    console.log("Suma: " + (a+b));
}
miFuncion(10,20)[PARAMETROS];
*/


/* ############################################################# */


//Funcion con retorno
function miFuncion2(a,b){
    return a + b;
} 
console.log(miFuncion2(10,20));


//Funciones de Tipo Expresion (Anonimas)
    //Declaracion funcion
    let x = function (a,b){return a + b};

    //Llamado funcion
    let resultado = x(1,2);
    console.log(resultado);


//Funciones Flecha
const sumarFuncionTipoFlecha = (a,b) => a + b;
resultado = sumarFuncionTipoFlecha(10,5);
console.log(resultado);


//Funciones Self Invoking (Se llaman asimismas) | Solo se puede llamar asimisma, ya no es reutilizable
(function (a,b){
    console.log("Ejecutando Funcion Self invoking | Suma:" + (a+b));
})(3,5);


//Funciones con Objetos | Las funciones se comportan como Objetos :D
function miFuncion3(a,b){
    console.log(arguments.length); //Verificar cuantos argumentos tiene una funcion
    return a + b; 
}
console.log(miFuncion3(10,2));

var miFuncionTexto = miFuncion3.toString();
console.log(miFuncionTexto);


//Arreglo de Argumentos
let array = sumarTodo(5,23,2,1,2,10);

function sumarTodo(){
    let suma = 0;
    for(let i = 0; i < arguments.length; i++){
        suma += arguments[i];
    }
    return suma;
}
console.log(array);
