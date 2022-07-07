'''En este segundo ejercicio, tendréis que crear un programa que tenga una clase llamada Alumno que tenga
como atributos su nombre y su nota. Deberéis de definir los métodos para inicializar sus atributos, imprimirlos
y mostrar un mensaje con el resultado de la nota y si ha aprobado o no.'''

class Alumno:
    def __init__(self, nombre, nota):
        self.nombre = nombre
        self.nota = nota

    def aprobarExamen(self):
        if self.nota < 10:
            print(f"Lo siento {self.nombre} reprobaste con una nota de {self.nota}. Debes estudiar mas")
        else:
            print(f"Felicidades {self.nombre}, aprobaste con una nota de {self.nota}")


alumno1 = Alumno("Pedro", 10)
alumno1.aprobarExamen()

alumno2 = Alumno("Juan", 20)
alumno2.aprobarExamen()

alumno3 = Alumno("Jose", 9.5)
alumno3.aprobarExamen()

