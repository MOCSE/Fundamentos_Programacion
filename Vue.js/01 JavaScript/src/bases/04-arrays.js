const arreglo = [1,2,3,4]
arreglo.push(5)

console.log(arreglo);

// Los arreglos tambien se pasan por referencias ya que tambien son objetos
const arreglo2 = arreglo

arreglo2.push(6)
console.log(arreglo)
console.log(arreglo2)

// Copiando correctamente un arreglo
const arreglo3 = [...arreglo]
console.log(arreglo)
console.log(arreglo3)


// Usando metodos de arreglos
const arreglo4 = arreglo3.map(function(n){
    return n * 2
})
console.log(arreglo4)