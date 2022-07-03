public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

            //if, else, else if
        int numeroIf = 0;

        if (numeroIf < 0){
            System.out.println("La variable numeroIf " + numeroIf + " es menor que cero");
        }
        else if (numeroIf > 0){
            System.out.println("La variable numeroIf " + numeroIf + " es mayor que cero");
        } else {
            System.out.println("La variable numeroIf " + numeroIf + " es igual a cero");
        }

            //while
        int numeroWhile = 0;

        while (numeroWhile < 3){
            numeroWhile ++;
            System.out.println("La variable numeroWhile ahora vale: " + numeroWhile);
        }

            //do_while
        int numeroDoWhile = 3;

        do {
            numeroDoWhile ++;
            System.out.println("La variable numeroDoWhile ahora vale: " + numeroDoWhile);
        } while (numeroDoWhile < 3);

            //for

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println("La variable numeroFor ahora vale: " + numeroFor);
        }

            //Case
        String estacion = "verano";

        switch (estacion){
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "verano":
                System.out.println("Estamos en verano");
                break;
            default:
                System.out.println("No estamos en una estación");
        }
    }
}

