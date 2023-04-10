//Sintaxis Clasica
function saludar(nombre){
    return `Hola ${nombre}`
}

const nombre = "Tony"
console.log(saludar(nombre));



//Funcion segura / anonima | Lambda Functions
const saludar2 = (nombre = "peter") => {
    return `Hola ${nombre}`
}
console.log(saludar2());



//Funciona muy bien con el return.. pero podemos evitarlo
const getUser = () => {
    return{
        uid: "ABC123",
        username: "Tony01"
    }
}
console.log(getUser());

const getUser2 = () => ({
    uid: "ABC123",
    username: "Tony01"
})
console.log(getUser2());




//Usando funciones en metodos:
const heroes = [{
    id: 1,
    name: "Batman"
},{
    id: 2,
    name: "Superman"
}]

//Busca si existe o no
const existe = heroes.some( ( heroe ) => heroe.id === 1);
console.log(existe);

//Busca si existe y returna el resultado
const existe2 = heroes.find( ( heroe ) => heroe.id === 1);
console.log(existe2);

//Desestructurando Objetos
const {name} = heroes.find( ( heroe ) => heroe.id === 1);
console.log(name);
