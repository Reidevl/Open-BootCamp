# Escribe una función que pueda decirte si un año (número entero) es bisiesto o no.

def es_bisiesto():
    anio = int(input('Digite un anio: \n'))

    if anio % 4 == 0 and (anio % 100 != 0 or anio % 400 == 0):
        valor = anio % 4 == 0 and (anio % 100 != 0 or anio % 400 == 0)
        return anio, 'es un anio bisiesto'
    else:
        return anio, 'no es un anio bisiesto'


print(es_bisiesto())
