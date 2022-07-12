'''En este segundo ejercicio, tendréis que crear un archivo py y dentro crearéis una clase Vehículo,
haréis un objeto de ella, lo guardaréis en un archivo y luego lo cargamos.'''

import pickle

class Vehiculo:
    marca = ""
    velocidad = 0.0

    def __init__(self, marca, velocidad):
        self.marca = marca
        self.velocidad = velocidad

    def getMarca(self):
        return self.marca


vehiculo = Vehiculo('Ford', 160)


# Serializo el objeto
f = open('datos.bin', 'wb')
pickle.dump(vehiculo, f)

f.close()

# Deserializo
'''f = open('datos.bin', 'rb')
carrito = pickle.load(f)

f.close()

print(carrito.getMarca())'''