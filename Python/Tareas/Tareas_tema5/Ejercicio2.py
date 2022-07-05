# Escribe una función que pueda decirte si un número (número entero) es primo o no.

def es_primo():
    numero = int(input('Digite un numero entero: \n'))

    for i in range(2, numero):
        if numero % i == 0:
            print(numero, '=', i, '*', numero/i)
            break
    else:
        print(numero, 'es un numero primo')


es_primo()
