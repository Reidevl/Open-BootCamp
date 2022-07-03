public class Main {
    /*Para practicar la encapsulación:

Crear clase Persona.
Crear variables las privadas edad, nombre y telefono de la clase Persona.
Crear gets y sets de cada propiedad.
Crear un objeto persona en el main.
Utiliza los gets y sets para darle valores
a las propiedades edad, nombre y telefono, por último muéstralas por consola.*/

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setEdad(25);
        persona.setNombre("Reiwil");
        persona.setTelefono(12345912);

        System.out.println("Hola, soy " + persona.getNombre() + " y tengo " +
                persona.getEdad() + " anios de edad y mi numero telefonico es " +
                persona.getTelefono());


        System.out.println("Hello world!");
    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad (int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }


}