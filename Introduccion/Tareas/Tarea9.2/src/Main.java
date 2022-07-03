public class Main {
    public static void main(String[] args) {
        /*Crea una clase Persona con las siguientes variables:
        La edad, el nombre, el teléfono.
        Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
        esta nueva clase tendrá la variable credito solo para esa clase.
        Crea ahora un objeto de la clase Cliente que debe tener como propiedades la
        edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
        Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona,
        y con una variable salario que solo tenga la clase Trabajador.*/

        Cliente cliente = new Cliente();
        cliente.edad = 40;
        cliente.nombre = "Joaquin Sanchez";
        cliente.telefono = 123456789;
        cliente.credito = "50.000 $";
        System.out.printf("Hola soy el cliente %s tengo %d anios, mi numero telefonico" +
                " es %d y tengo un credito de %s\n\n", cliente.nombre, cliente.edad, cliente.telefono, cliente.credito);

        Trabajador trabajador = new Trabajador();
        trabajador.edad= 30;
        trabajador.nombre = "Marcelo";
        trabajador.telefono = 987654321;
        trabajador.salario = "1000$";
        System.out.printf("Hola soy el trabajador %s tengo %d anios, mi numero telefonico" +
                " es %d y tengo un salario de %s\n\n", trabajador.nombre, trabajador.edad, trabajador.telefono, trabajador.salario);

    }
}

class Persona{
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona{
    String credito;
}

class Trabajador extends Persona{
    String salario;
}