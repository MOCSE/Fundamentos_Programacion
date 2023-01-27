// Funciones


// Declaración de Función | Primero se registran las funciones
sumar();
function sumar() {
    console.log(10 + 10);
}


// Expresión de la función | No esta decalrada como funcion, por lo tanto es una variable
const sumar2 = function() {
    console.log( 3 + 3);
}
sumar2();

// IIFE | Proteger funciones para q no sean leidas de otros archivos
(function (){
    console.log("OLA");
})();