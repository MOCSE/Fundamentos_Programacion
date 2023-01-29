// Eventos en JavaScript...

// Hay muchos eventos ocurriendo en tus sitios y aplicaciones web, cuando un usuario da click, cuando dan scroll, al presionar en un botón, enviar un formulario, pero uno de los más comunes es esperar a que el documento este listo...

console.log('1');
//Callback
window.addEventListener('load', function() { // Cuando el Archivo JS y los archivos dependientes han cargado como es el HTML y las imagenes...
    console.log('2');
});

window.onload = function() {
    console.log('3')
};

document.addEventListener('DOMContentLoaded', function() { // Este se ejecuta cuando el HTML ha sido descargado pero no espera por CSS o imagenes...
    console.log('4');
});

console.log('5');


// // Eventos Scroll...
// window.onscroll = function(e) {
//     console.log('scrolling...');

//     console.log(this.scrollY);
// }