const nombre = 'Joaquin';
const apellido = 'Baeza';

const estudiante = `${nombre} ${apellido}`;

const estudianteMayus = estudiante.toUpperCase();

const estudianteMinus = estudiante.toLowerCase();

const numeroCaracteres = estudiante.length;

const primeraLetra = estudiante.charAt(0);

const ultimaLetra = estudiante.charAt(estudiante.length - 1);

const noEspacios = estudiante.split(' ').join('');

const isNombre = estudiante.includes(nombre);

console.log(isNombre);
