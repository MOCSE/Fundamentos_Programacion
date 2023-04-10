
// Importacion normal
import { owners } from "../data/heroes";

// Importacion por defecto
import superHeroes from "../data/heroes";

// const [ dc, marvel] = owners
// console.log(dc)
// console.log(marvel);

// console.log(superHeroes)



// Exportaciones de funciones

export const getHeroById = ( id ) => superHeroes.find( hero => hero.id === id )
export const getHeroesByOwner = ( owner ) => superHeroes.filter( hero => hero.owner === owner )

