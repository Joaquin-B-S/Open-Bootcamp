public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Joaquin", "978451236", 30, 50000);
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getEdad());
        System.out.println(cliente.getCredito());

        Trabajador trabajador = new Trabajador("Pedro", "978451236", 35, 100000);
        System.out.println(trabajador.getNombre());
        System.out.println(trabajador.getTelefono());
        System.out.println(trabajador.getEdad());
        System.out.println(trabajador.getSalario());
    }
}

class Persona {
    String nombre;
    String telefono;
    int edad;

    public Persona(String nombre, String telefono, int edad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

class Cliente extends Persona {
    int credito;

    public Cliente(String nombre, String telefono, int edad, int credito) {
        super(nombre, telefono, edad);
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    int salario;

    public Trabajador(String nombre, String telefono, int edad, int salario) {
        super(nombre, telefono, edad);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}