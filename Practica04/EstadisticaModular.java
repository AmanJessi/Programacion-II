package Practica04;
import java.util.Scanner;
//Este ejercicio esta resuelto con programacion modular-estructurada
public class EstadisticaModular {
    public static double promedio(double[] numeros) {
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma / numeros.length;  }
    
    public static double desviacionEstandar(double[] numeros) {
        double media = promedio(numeros);
        double suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += Math.pow(numeros[i] - media, 2);
        }
        return Math.sqrt(suma / (numeros.length - 1));  }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] numeros = new double[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextDouble();
        }
        System.out.println("Promedio: " + promedio(numeros));
        System.out.println(
            "Desviacion estandar: " +
            desviacionEstandar(numeros)
        );
    }
}
