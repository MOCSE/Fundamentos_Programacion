/** Cargando Documento */
document.addEventListener('DOMContentLoaded', function(){
    
    //Funciones
    eventListeners();
    darkMode();
});


/** eventListeners */
function eventListeners(){
    const mobileMenu = document.querySelector('.mobile-menu');
    mobileMenu.addEventListener('click', navegacionResponsive);
}

/** Boton Resposive Nav */
function navegacionResponsive(){
    const navegacion = document.querySelector(".navegacion");
    navegacion.classList.toggle("mostrar"); // If-else para Add & Remove
}

/** Darkmode */
function darkMode() {
    // Comprueba si estaba habilidado dark mode
    const darkLocal = window.localStorage.getItem('dark');
    if(darkLocal === 'true') {
        document.body.classList.add('dark-mode');
    }
    // Añadimos el evento de click al botón de dark mode
    document.querySelector('.dark-mode-boton').addEventListener('click', darkChange);
}
 
function darkChange() {
    const darkLocal = window.localStorage.getItem('dark');
 
    if(darkLocal === null || darkLocal === 'false') {
        // No está inicializado darkLocal o es falso
        window.localStorage.setItem('dark', true);
        document.body.classList.add('dark-mode');
    } else {
        // Está activado darkMode, por lo que se desactiva
        window.localStorage.setItem('dark', false);
        document.body.classList.remove('dark-mode');
    }
}