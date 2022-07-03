'''Escribe un programa capaz de mostrar todos los números impares desde un número de
inicio y otro final.
Por ejemplo: teniendo numero_inicial = 2 y numero_final = 8, el programa debe imprimir
 por consola: [3, 5, 7]'''

numeroInicial = int(input('Digite un numero inicial: \n'))

numeroFinal = int(input('Digite un numero final: \n'))

# Creo una lista para reportar el numero en el formato solicitado
lista = []

for numero in range (numeroInicial, numeroFinal + 1):
    if numero % 2 == 0:
        continue
    else:
        lista.append(numero)

print(lista)