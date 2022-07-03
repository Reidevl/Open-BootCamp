public class Main {
//    public static void main(String[] args) {
//        getter y setter
//        Vehiculo coche = new Vehiculo();
//        coche.setTipo("Coupe");
//        coche.setVelocidadMaxima(120);
//        coche.setRapido(true);
//
//        Vehiculo moto = new Vehiculo();
//        moto.setTipo("Scotter");
//        moto.setVelocidadMaxima(50);
//        moto.setRapido(false);
//
//        System.out.println(coche.getTipo());
//        System.out.println(coche.getVelocidadMaxima());
//        System.out.println(moto.getTipo() + " "+ moto.getVelocidadMaxima());
//        System.out.println(coche.isRapido());
//        System.out.println(moto.isRapido());
    public static void main(String[] args){

    }
}

abstract class Vehiculo {
    private String tipo;
    private int velocidadMaxima;
    private String sonido;

    abstract public void setSonido(String sonido);
    abstract public String getSonido();

    public void setVelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima(){
        return this.velocidadMaxima;
    }

    public void setTipo(String valor){
        this.tipo = valor;
    }
    public String getTipo(){
        return this.tipo;
    }

}