// Seleccionar elementos...

// querySelector | Retorna de 0 a 1 elementos
const textoHeading = document.querySelector('.header__texto h2');
console.log(textoHeading);
textoHeading.textContent = 'Nuevo Heading'; // También se puede utilizar .text

// querySelectorAll | Retorna de 0 a n elementos
const enlaces = document.querySelectorAll('.navegacion a');
console.log(enlaces);

// getElementById
const heading2 = document.getElementById(); //se pone directo el id




// Algunas operaciones...

// Cambiar el texto
enlaces[0].textContent = 'Nuevo Texto enlace';

// Cambiar el enlace del primer enlace
enlaces[0].href = 'google.com';

// Agregar una clase...
enlaces[0].classList.add('nueva-clase');

// Eliminar una clase...
// enlaces[0].classList.remove('navegacion__enlace');
