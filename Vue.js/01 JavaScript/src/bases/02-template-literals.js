const nombre = "Oscar"
const apellido = "Romero"

//Template String usando `` back tick
const nombreCompleto = `${nombre} ${apellido}`
console.log(nombreCompleto)


console.log(`Resultado: ${ 1 + 5}`)


function getSaludo(nombre){
    return "Hola " + nombre
}
console.log(`Este es un texto: ${getSaludo("David")}`)