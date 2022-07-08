'''
En este segundo ejercicios tendréis que crear un script que nos diga
 si es la hora de ir a casa. Tendréis que hacer uso del modulo time.
 Necesitaréis la fecha del sistema y poder comprobar la hora.
En el caso de que sean más de las 7, se mostrará un mensaje y en caso
contrario, haréis una operación para calcular el tiempo que queda de
trabajo.'''

from _datetime import datetime

#Fecha completa
#print(datetime.today().strftime('%A, %B %d, %Y %H:%M:%S'))

#Hora completa
#print(datetime.today().strftime('%H:%M:%S'))

#Horas como entero
#print(int(datetime.today().strftime('%H')))

hora_sistema = int(datetime.today().strftime('%H'))

def comprobarHora():
    if hora_sistema > 19:
        print('Es hora de ir a casa')
    else:
        tiempo_restante = 19 - hora_sistema
        print(f'Apenas son las {hora_sistema}, aun te quedan {tiempo_restante} hora/s de trabajo')

comprobarHora()