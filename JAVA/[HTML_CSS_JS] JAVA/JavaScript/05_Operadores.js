//Operadores Aritmeticos
let a = 3, b = 2;
    //Suma
    let z = a + b;
    console.log(z);

    //Resta
    z = a - b;
    console.log(z);

    //Producto
    z = a * b;
    console.log(z);

    //Division
    z = a / b;
    console.log(z);

    //Modulo
    z = a % b;
    console.log(z);

    //Exponente
    z = a ** b;
    console.log(z);


    //Incremento & Decremento
        //Pre-Incremento (++Variable)
        z = 0; aux = 1;
        z = ++aux;
        console.log("Z: " + z);
        console.log("Aux: " + aux);
        //Post-Incremento (++Variable)
        z = 0; aux = 1;
        z = aux++;
        console.log("Z: " + z);
        console.log("Aux: " + aux);
    

//Operadores de Asignacion
let c = 1;

c += 3; // c = c + 3
console.log(c);

c -= 2; // c = c + 3
console.log(c);


//Operadores de Comparacion
a = 3, b = 2, c = "3";

    //Comparacion Basica | Mo revisa si los tipos de datos son iguales
    z = (a == c);
    console.log(z);

    //Comparacion Estrica | Revisa si los tipos de datos son iguales
    z = (a === c);
    console.log(z);

    //Comparacion Distinto A
    z = (a != b);
    console.log(z);

    //Comparacion Distinto A | Revisa si los tipos de datos son iguales
    z = (a !== c);
    console.log(z);


//Operadores Relacionales

    // <,>,<=,>=;
    // AND && , OR ||

//Operador Ternario

let resultado = (3>2) ? "verdadero" : "falso";
console.log(resultado);
