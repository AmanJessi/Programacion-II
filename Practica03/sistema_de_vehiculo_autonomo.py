class Sensor:
    tipo = "Genérico"

    def __init__(self, id):
        self.id = id
        self.encendido = False

    def activar(self):
        self.encendido = True
        print("Sensor activado")

    def desactivar(self):
        self.encendido = False
        print("Sensor desactivado")


class Camara(Sensor):
    tipo = "Cámara"

    def __init__(self, id, resolucion, **kwargs):
        self.resolucion = resolucion
        super().__init__(id, **kwargs)


class SensorLuzLaser(Sensor):
    tipo = "Luz Laser"

    def __init__(self, id, alcance, **kwargs):
        self.alcance = alcance
        super().__init__(id, **kwargs)


class VehiculoAutonomo(Camara, SensorLuzLaser):
    tipo = "Vehículo Autónomo"

    def __init__(self, id, resolucion, alcance):
        super().__init__(
            id=id,
            resolucion=resolucion,
            alcance=alcance
        )


# Programa principal
vehiculo = VehiculoAutonomo("V001", "4K", 100)

print("ID:", vehiculo.id)
print("Tipo:", vehiculo.tipo)
print("Resolución:", vehiculo.resolucion)
print("Alcance:", vehiculo.alcance)
print("Encendido:", vehiculo.encendido)

vehiculo.activar()
print("Encendido:", vehiculo.encendido)

vehiculo.desactivar()
print("Encendido:", vehiculo.encendido)