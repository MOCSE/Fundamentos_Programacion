const { src, dest, watch, parallel } = require("gulp");

/* Dependencias */

// CSS
const sass = require("gulp-sass")(require("sass"));
const plumber = require("gulp-plumber");

// JS
const terser = require("gulp-terser-js");

// Optimizar CSS
const autoprefixer = require("autoprefixer");   // Asegurar q funciona en el navegador
const cssnano = require("cssnano");             // Comprimir CSS
const postcss = require("gulp-postcss");        // Transformaciones entre los 2 anteriores

//SourceMap
const sourcemaps = require("gulp-sourcemaps");

// Imagenes
const cache = require("gulp-cache");
const imagemin = require("gulp-imagemin");
const webp = require("gulp-webp");
const avif = require("gulp-avif");




/* Funciones */

// Compilar SCSS a CSS
function css(done){
    src("src/scss/**/*.scss")               // Indentificar el archivo de SASS (/**/* Para detectar todos los archivos SASS)
        .pipe(plumber())                    // Evitar que se dentenga la compilacion cuando existen errores
        .pipe(sass())                       // Compilar el archivo de SASS
        .pipe(dest("build/css"));           // Guardar en el disco duro

    done(); // Callback para avisar a gulp q llegamos al final
}

// Hacer funcionar JavaScript en SASS
function js(done){
    src('src/js/**/*.js')
        .pipe(dest('build/js'));

    done()
}

// Convertir imagenes a Webp
function versionWebp(done){ 

    const opciones = {      // Cambiar calidad de imagen
        quality: 50
    };

    src('src/img/**/*.{png,jpg}')
        .pipe(webp(opciones))
        .pipe(dest('build/img'));

    done();
}

// Convertir imagenes a Avif
function versionAvif(done){ 

    const opciones = {      // Cambiar calidad de imagen
        quality: 50
    };

    src('src/img/**/*.{png,jpg}')
        .pipe(avif(opciones))
        .pipe(dest('build/img'));

    done();
}

// Convertir imagenes a un menor peso
function imagenesOP(done){

    const opciones = {      // Cambiar calidad de imagen
        optimizationLevel: 3
    };

    src('src/img/**/*.{png,jpg}')
        .pipe(cache(imagemin(opciones)))
        .pipe(dest('build/img'));

    done();
}

// Optimizar CSS
function cssOp(done){
    src("src/scss/**/*.scss")               // Indentificar el archivo de SASS (/**/* Para detectar todos los archivos SASS)
        .pipe(plumber())                    // Evitar que se dentenga la compilacion cuando existen errores
        .pipe(sourcemaps.init())            // SourceMap Para ubicar el CSS minificado
        .pipe(sass())                       // Compilar el archivo de SASS
        .pipe(postcss                       
            ([autoprefixer(),cssnano()]))   // Optimizar(Minificar) CSS
        .pipe(sourcemaps.write("."))
        .pipe(dest("build/css"));           // Guardar en el disco duro

    done(); // Callback para avisar a gulp q llegamos al final
}

// Optimizar JS
function jsOp(done){
    src('src/js/**/*.js')
        .pipe(sourcemaps.init())
        .pipe(terser())
        .pipe(sourcemaps.write("."))
        .pipe(dest('build/js'));

    done()
}

// Correr SASS
function dev(done){
    watch("src/scss/**/*.scss", css)    // Watch para estar compilando cuando existan cambios en el codigo css
    watch("src/js/**/*.js", js)         // Watch para estar compilando cuando existan cambios en el codigo js

    done();
}


/* EXPORTS - COMANDOS [npx gulp "variable"] */
exports.css = css;
exports.cssOp = cssOp;
exports.js = js;
exports.jsOp = jsOp;
exports.imagenesOP = imagenesOP;
exports.versionAvif = versionAvif;
exports.versionWebp = versionWebp;

// Correr SASS
exports.dev = parallel(dev);   // parallel -> ejecutar n funciones al mismo tiempo

// Optimizar General (CSS & JS)
exports.optimizar = parallel(cssOp, jsOp)

// Optimizar General Imagenes
exports.optimizarImg = parallel(imagenesOP, versionAvif, versionWebp)
