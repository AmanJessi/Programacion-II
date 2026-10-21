package Practica02;
import java.util.Scanner;

public class TestEcuacionLineal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese a: "); double a = teclado.nextDouble();

        System.out.print("Ingrese b: "); double b = teclado.nextDouble();

        System.out.print("Ingrese c: "); double c = teclado.nextDouble();

        System.out.print("Ingrese d: "); double d = teclado.nextDouble();

        System.out.print("Ingrese e: "); double e = teclado.nextDouble();

        System.out.print("Ingrese f: "); double f = teclado.nextDouble();

        EcuacionLineal ecuacion =
                new EcuacionLineal(a, b, c, d, e, f);

        if (ecuacion.tieneSolucion()) {
            System.out.println("x = " + ecuacion.getX());
            System.out.println("y = " + ecuacion.getY());
        } else {
            System.out.println("La ecuacion no tiene solucion.");
        }
    }
}
