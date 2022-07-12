''' Crea un script que le pida al usuario una lista de países (separados por comas). Éstos se deben almacenar en
una lista. No debería haber países repetidos (haz uso de set). Finalmente,muestra por consola la lista de países
ordenados alfabéticamente y separados por comas. '''

paises = input('Digite una varios paises separados por comas: \n')

# separo por comas
res = paises.split(",")
res.sort()
print('Lista sin ordenar ni filtrar: ',res)

# convierto en set para eliminar los duplicados
convertida = set(res)
print('Lista filtrada sin ordenar : ',convertida)

# Convierto nuevamente en lista y ordeno
lista_paises = list(convertida)
lista_paises.sort()
print('Lista ordenada y filtrada: ',lista_paises)