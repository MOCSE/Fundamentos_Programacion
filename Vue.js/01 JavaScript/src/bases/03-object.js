const persona = {
    nombre: "Tony",
    apellido: "Stark",
    edad: 45,
    direccion:{
        ciudad: "New York",
        zip: 554565,
        lat: 14.5554,
        lng: 34.5543
    }
}

//Objetos son pasados por referencia en JS
const persona2 = persona;
persona2.nombre = "Peter"

console.log(persona)
console.log(persona2)


//Copiar correctamente
const persona3 = {...persona};
persona3.nombre = "Peter"

console.log(persona)
console.log(persona3)