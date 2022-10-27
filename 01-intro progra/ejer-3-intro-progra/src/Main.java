public class Main{
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setEdad(20);
        System.out.println(persona.getEdad());

        persona.setNombre("Joaquin");
        System.out.println(persona.getNombre());

        persona.setTelefono("+56 9 9055 6531");
        System.out.println(persona.getTelefono());

    }

}
class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
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
}