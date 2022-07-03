public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        Moto moto = new Moto();

        ejecutaAcelerar(coche);
        ejecutaAcelerar(moto);

        System.out.println("Hello world!");
    }

    public static void ejecutaAcelerar(Vehiculo vehiculo){
        vehiculo.Acelerar(15);
        vehiculo.Frenar(15);
    }
}

interface Vehiculo{
    //No se implementa por si sola, se debe crear una Clase que la implemente
    void Acelerar (int cuantaVelocidad);
    void Frenar (int cuantaVelocidad);
}

class Coche implements Vehiculo{
    public void Acelerar (int cuantaVelocidad){
        System.out.println("Coche () -> Acelerar ()");
    }
    public void Frenar (int cuantaVelocidad){
        System.out.println("Coche () -> Frenar ()");
    }
}

class Moto implements Vehiculo{
    public void Acelerar (int cuantaVelocidad){
        System.out.println("Moto () -> Acelerar ()");
    }
    public void Frenar (int cuantaVelocidad){
        System.out.println("Moto () -> Frenar ()");
    }
}