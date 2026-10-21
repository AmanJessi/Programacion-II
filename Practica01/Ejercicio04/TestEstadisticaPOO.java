package Practica04;

import java.util.Scanner;

public class TestEstadisticaPOO {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double[] numeros = new double[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextDouble();
        }

        EstadisticaPOO estadistica = new EstadisticaPOO(numeros);

        System.out.println("Promedio: " + estadistica.promedio());

        System.out.println(
            "Desviacion estandar: " +
            estadistica.desviacionEstandar()
        );
    }
}
