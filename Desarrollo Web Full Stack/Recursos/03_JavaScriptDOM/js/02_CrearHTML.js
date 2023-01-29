// Generar HTML desde JavaScript...
const nuevoEnlace = document.createElement('A');

console.log(nuevoEnlace);

// Un enlace tiene una clase...
nuevoEnlace.classList.add('navegacion__enlace');

// Tiene un href
nuevoEnlace.href = 'nuevo-enlace.html';

// Tiene un Texto...
nuevoEnlace.textContent = 'Un Nuevo Enlace';

// console.log(nuevoEnlace);

// Finalmente se agrega donde lo deseamos colocar...

// Tienes que seleccionar el elemento padre

const navegacion = document.querySelector('.navegacion');
navegacion.appendChild(nuevoEnlace);