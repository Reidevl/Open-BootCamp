'''Escribe una función que calcule el área de un triángulo, recibiendo la
altura y la base como parámetros y otra función que calcule el área de un
círculo recibiendo el radio del mismo.'''
import math

def area_triangulo():
    base = float(input('Digite la base del triangulo: \n'))
    altura = float(input('Digite la altura del triangulo: \n'))

    area = (base*altura)/2
    return area

def area_circulo():
    radio = float(input('Digite el radio del circulo: \n'))

    area = math.pi*(radio**2)
    return area


print(area_triangulo())

print(area_circulo())
