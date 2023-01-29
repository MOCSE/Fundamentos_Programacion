// Eventos con Click y submit...

const btnEnviar = document.querySelector('.formulario input[type=submit]');
console.log(btnEnviar);

btnEnviar.addEventListener('click', function() { // callback o closure 
     console.log('click');
});

