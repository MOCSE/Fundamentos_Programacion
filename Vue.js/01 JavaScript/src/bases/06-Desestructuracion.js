
// Desestructuracion de objetos
const person = {
    name: 'Tony',
    age: 45,
    codeName: 'Ironman',
}

const { age, name, codeName, power = 'No tiene poder' } = person

// console.log( name )
// console.log( age )
// console.log( codeName )
// console.log( power )

const createHero = ({ name, age, codeName, power }) => 
    ({
        id: 1123416523,
        name,
        age,
        codeName,
        power,
    })


console.log(  createHero( person )   )



// Desestructuracion de arreglos
const characters = ['Goku','Vegeta','Trunks', 'Goten']

const [ g, v, t, goten = 'No tiene valor'  ] = characters


const returnArray = ([ letters, numbers ]) => {
    return [ letters , numbers ]
}

const [ letters, numbers ] = returnArray(['XYZ',987])

console.log( letters, numbers )

