let factorial = 1;
let contador = 1;

while (true) {
  if (contador > 10) {
    break;
  }
  factorial *= contador;
  contador++;
}

console.log(factorial);
