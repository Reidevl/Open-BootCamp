'''En este ejercicio, tendréis que crear un archivo py donde creéis
un archivo txt, lo abráis y escribáis dentro del archivo. Para ello,
 tendréis que acceder dos veces al archivo creado.'''

def main():
    f = open('ejercicio1.txt', 'a')

    f.write('Hola,\n')
    f.write('soy parte\n')
    f.write('del ejercicio\n')

    f.close()


if __name__ == '__main__':
    main()
