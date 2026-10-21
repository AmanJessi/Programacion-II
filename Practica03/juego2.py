import random


class Juego:
    def __init__(self, vidas):
        self.vidasIniciales = vidas
        self.numeroDeVidas = vidas
        self.record = 0

    def reiniciaPartida(self):
        self.numeroDeVidas = self.vidasIniciales

    def actualizaRecord(self):
        self.record = self.numeroDeVidas

    def quitaVida(self):
        self.numeroDeVidas -= 1
        return self.numeroDeVidas > 0


class JuegoAdivinaNumero(Juego):
    def __init__(self, vidas):
        super().__init__(vidas)
        self.numeroAAdivinar = 0

    def validaNumero(self, numero):
        return 0 <= numero <= 10

    def juega(self):
        self.reiniciaPartida()
        self.numeroAAdivinar = random.randint(0, 10)

        while self.numeroDeVidas > 0:
            try:
                intento = int(input("Adivina un número entre 0 y 10: "))
            except ValueError:
                print("Debes ingresar un número entero.")
                continue

            if not self.validaNumero(intento):
                print("El número debe estar entre 0 y 10.")
                continue

            if intento == self.numeroAAdivinar:
                print("¡Acertaste!")
                self.actualizaRecord()
                return

            if self.quitaVida():
                if intento < self.numeroAAdivinar:
                    print("El número a adivinar es mayor. Intenta de nuevo.")
                else:
                    print("El número a adivinar es menor. Intenta de nuevo.")
            else:
                print("Te quedaste sin vidas.")
                print("El número era", self.numeroAAdivinar)


class JuegoAdivinaPar(JuegoAdivinaNumero):
    def validaNumero(self, numero):
        if not 0 <= numero <= 10:
            print("El número debe estar entre 0 y 10.")
            return False
        if numero % 2 != 0:
            print("Error: debes ingresar un número par.")
            return False
        return True


class JuegoAdivinaImpar(JuegoAdivinaNumero):
    def validaNumero(self, numero):
        if not 0 <= numero <= 10:
            print("El número debe estar entre 0 y 10.")
            return False
        if numero % 2 == 0:
            print("Error: debes ingresar un número impar.")
            return False
        return True


class Aplicacion:
    def main(self):
        juegoNumero = JuegoAdivinaNumero(3)
        juegoPar = JuegoAdivinaPar(3)
        juegoImpar = JuegoAdivinaImpar(3)

        print("\n--- Juego de adivinar cualquier número ---")
        juegoNumero.juega()

        print("\n--- Juego de adivinar un número par ---")
        juegoPar.juega()

        print("\n--- Juego de adivinar un número impar ---")
        juegoImpar.juega()


app = Aplicacion()
app.main()