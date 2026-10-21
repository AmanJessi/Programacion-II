import random

class Juego:
    def __init__(self, vidas):
        self.numeroDeVidas = vidas
        self.record = 0

    def reiniciaPartida(self):
        self.numeroDeVidas = 3

    def actualizaRecord(self):
        self.record = self.numeroDeVidas

    def quitaVida(self):
        self.numeroDeVidas = self.numeroDeVidas - 1
        return self.numeroDeVidas > 0


class JuegoAdivinaNumero(Juego):
    def __init__(self, vidas):
        super().__init__(vidas)
        self.numeroAAdivinar = 0

    def juega(self):
        self.reiniciaPartida()
        self.numeroAAdivinar = random.randint(0, 10)

        while self.numeroDeVidas > 0:
            intento = int(input("Adivina un número entre 0 y 10: "))

            if intento == self.numeroAAdivinar:
                print("¡Acertaste!")
                self.actualizaRecord()
                return

            if self.quitaVida():
                if intento < self.numeroAAdivinar:
                    print("El número es mayor. Intenta de nuevo.")
                else:
                    print("El número es menor. Intenta de nuevo.")
            else:
                print("Te quedaste sin vidas.")
                print("El número era", self.numeroAAdivinar)


class Aplicacion:
    def main(self):
        juego = JuegoAdivinaNumero(3)
        juego.juega()


app = Aplicacion()
app.main()