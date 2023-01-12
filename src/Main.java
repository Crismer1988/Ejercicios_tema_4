public class Main {
    public static void main(String[] args) {
        int numerolf = 0;
        int numeroWhile = 0;
        var estacion = "Otoño";

                if (numerolf > 0){
                    System.out.println("Es positivo");
                } else if (numerolf < 0){
                    System.out.println("Es negativo");
                } else
                    System.out.println("Es cero");

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        do {numeroWhile = numeroWhile + 1;
            System.out.println(numeroWhile);
        } while (numeroWhile > 4);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor ++) {
            System.out.println(numeroFor);
        }

        switch (estacion){
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            default:
                System.out.println("Ingresar estacion");
            break;
        }
    }

}