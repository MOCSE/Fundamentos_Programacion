const datos = {
    nombre: '',
    email: '',
    mensaje: ''
}

// submit
const formulario = document.querySelector('.formulario');

formulario.addEventListener('submit', function(e) {
    e.preventDefault();
    console.log(e);
    console.log('Di click y la página ya no recarga');
    console.log(datos);

    // Validar el Formulario...
    const { nombre, email, mensaje } = datos;

    if(nombre === '' || email === '' || mensaje === '' ) {
        console.log('Al menos un campo esta vacio');
        mostrarError('Todos los campos son obligatorios');
        return; // Detiene la ejecución de esta función
    }

    console.log('Todo bien...')
    mostrarMensaje('Mensaje enviado correctamente');
});


function mostrarError(mensaje) {
    const alerta = document.createElement('p');
    alerta.textContent = mensaje;
    alerta.classList.add('error');

    formulario.appendChild(alerta);

    setTimeout(() => {
        alerta.remove();
    }, 3000);
}

function mostrarMensaje(mensaje) {
    const alerta = document.createElement('p');
    alerta.textContent = mensaje;
    alerta.classList.add('correcto');
    formulario.appendChild(alerta);

    setTimeout(() => {
        alerta.remove();
    }, 3000);
}