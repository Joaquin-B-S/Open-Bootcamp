public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;

        if (numeroIf == 0) {
            System.out.println("El numero es 0");
        } else if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }

        int numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        int numeroDoWhile = 3;
        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroWhile < 3);


        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        String estacion = "Invierno";

        switch (estacion) {
            case "Primavera":
                System.out.println("Primavera");
                break;
            case "Verano":
                System.out.println("Verano");
                break;
            case "Otoño":
                System.out.println("Otoño");
                break;
            case "Invierno":
                System.out.println("Invierno");
                break;
            default:
                System.out.println("Nombre de estación no valida");
        }
    }

}
