
// Las promesas son basicamente los try-catch
console.log("Inicio")

new Promise((resolve, reject) => {

    console.log("Cuerpo de la Promeso")
    resolve("Promesa resuelta")
    reject("Promesa resuelta con error")

})
    .then(console.log)  // Para resolve
    .catch(console.log) // Para reject

console.log("-------Fin--------")


// Promesas aplicadas
import { getHeroById } from "./bases/07-Importaciones-Exportaciones"

const getHeroByIdAsync = (id) => {
    return new Promise((resolve, reject) => {

        setTimeout(() => {

            const hero = getHeroById(id)

            if (hero) {
                resolve(hero)
            } else {
                reject('Heroe no existe')
            }

        }, 1000);

    });
}


getHeroByIdAsync(3)
    .then(h => {
        console.log(`El héroe es: ${h.name}`)
    })
    .catch(console.log)
