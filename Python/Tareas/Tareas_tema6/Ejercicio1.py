'''En este ejercicio vais a crear la clase Vehículo la cual tendrá los siguientes atributos:
Color
Ruedas
Puertas
Por otro lado crearéis la clase Coche la cual heredará de Vehículo y tendrá los siguientes atributos:
Velocidad
Cilindrada
Por último, tendrás que crear un objeto de la clase Coche y mostrarlo por consola.'''

class Vehiculo:
    color = "Azul"
    ruedas = 4
    puertas = 4

class Coche(Vehiculo):
    velocidad = "140km/h"
    cilindrada = "995 cc"

spark = Coche()

print(f"El coche es un Spark color {spark.color}")
print(f"Tiene {spark.ruedas} ruedas")
print(f"Tiene {spark.puertas} puertas")
print(f"El coche alcanza una velocidad maxima de {spark.velocidad} Km/h")
print(f"El coche tiene una cilindrada de {spark.cilindrada}")
