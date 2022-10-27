public class Coche {
    int puertas;

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void getPuertas() {
        System.out.println("La cantidad de puertas son: " + this.puertas);
    }

    public static void main(String[] args) {
        Coche miChoche = new Coche();
        miChoche.setPuertas(1);
        miChoche.getPuertas();
    }
}
