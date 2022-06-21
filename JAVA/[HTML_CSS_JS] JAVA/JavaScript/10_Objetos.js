//Creacion de Objetos 1 | Más comun JEJE :D
let personaM = {
    nombre: "Juan",
    apellido: "Perez",
    email: "Perez234@gmail.com",
    edad: 28
}
console.log(personaM);
console.log(personaM.nombre)

//Creacion de Objetos 2 | Se crea un objeto vacio primero con 'new'
let persona2 = new Object();
persona2.nombre = "Carlos";
persona2.direccion = "Antonio Caso 10 L2";
persona2.tel = "5523210728";


/*######################################################################*/


//Metodos
let persona = {
    nombre: "Juan",
    apellido: "Perez",
    email: "Perez234@gmail.com",
    edad: 28,

    nombreCompleto: function(){
        return this.nombre + " " + this.apellido;
    }
}
console.log(persona.nombreCompleto());

//Acceder a Propiedades de Objetos
console.log(persona.nombre);
console.log(persona["apellido"]);

//Agregar Propiedades de un Objeto
persona.tel = "5523210728";
console.log(persona.tel);

//Eliminar Propiedades de un Objeto

//Recorrer todas las Propiedades y/o Valores de un Objeto | For in
for(nombrePropiedad in persona){
    console.log(nombrePropiedad);
    console.log(persona[nombrePropiedad]);
}

