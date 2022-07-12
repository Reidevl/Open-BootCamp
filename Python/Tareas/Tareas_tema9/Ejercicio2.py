'''En este segundo ejercicio, tenéis que crear una aplicación que obtendrá los elementos impares de una
lista pasada por parámetro con filter y realizará una suma de todos estos elementos obtenidos mediante
reduce.'''

from functools import reduce

lista = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]

resultado = filter(lambda x: x % 2 == 1, lista)
lista_filtrada = list(resultado)
print(lista_filtrada)


resultado_final = reduce(lambda a, b: a + b, lista_filtrada)
print(resultado_final)
