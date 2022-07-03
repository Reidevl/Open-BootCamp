public class Main {

    public static void main(String[] args) {
        Coche coche = new Coche();
        System.out.printf("Puertas: %d\n", coche.numeroDePuertas);
        System.out.println(coche.velocidadMaxima);
        System.out.println(coche.velocidadActual);

        Coche coche2 = new Coche(2,90);
        System.out.printf("Puertas: %d\n", coche2.numeroDePuertas);
        System.out.println(coche2.velocidadMaxima);
        System.out.println(coche2.velocidadActual);
    }
}

class Coche{
    int numeroDePuertas;
    int velocidadMaxima;
    float velocidadActual;

    public Coche(){
        numeroDePuertas = 5;
        velocidadMaxima = 120;
        System.out.println("Estoy en el constructor SIN PARAMETROS");
    }

    public Coche(int numeroDePuertas, int velocidadMaxima){
        this.numeroDePuertas = numeroDePuertas;
        this.velocidadMaxima = velocidadMaxima;
        System.out.println("Estoy en el constructor CON PARAMETROS");
    }
}