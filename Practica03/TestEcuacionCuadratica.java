package Practica03;
import java.util.Scanner;

public class TestEcuacionCuadratica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese a: "); double a = teclado.nextDouble();

        System.out.print("Ingrese b: "); double b = teclado.nextDouble();

        System.out.print("Ingrese c: "); double c = teclado.nextDouble();

        EcuacionCuadratica ecuacion =
                new EcuacionCuadratica(a, b, c);
        
        double discriminante = ecuacion.getDiscriminante();

        System.out.println("Discriminante: " + discriminante);

        if (discriminante > 0) {
            System.out.println("Dos raices:");
            System.out.println("Raiz 1: " + ecuacion.getRaiz1());
            System.out.println("Raiz 2: " + ecuacion.getRaiz2());

        } else 
                if (discriminante == 0) {
                System.out.println("Una raiz:");
                System.out.println("Raiz: " + ecuacion.getRaiz1());
                } else {
                     System.out.println("No tiene raices reales.");
        }
    }
}    