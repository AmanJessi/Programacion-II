package Practica02;
/**
* Programa de manejo de fracciones .
*
* @author Juan Perez
* @version 1.0 03/03/2026
*
*/
public class TestFraccion {
    public static void main(String[] args) {
        // Crea los objetos Fraccion
        Fraccion f1 = new Fraccion (12 , 24) ;
        Fraccion f2 = new Fraccion (1 , 3) ;
        // Imprime cada fraccion
        System . out . println ("f1 = " + f1 ) ;
        System . out . println ("f2 = " + f2 ) ;
        // Imprime resultados de las operaciones
        System . out . println (" suma = " + f1 . suma ( f2 ) ) ;
        System . out . println (" resta = " + f1 . resta ( f2 ) ) ;
        
        System.out.println("Original: " + f1);
        System.out.println("Simplificada: " + f1.simplifica());
        System.out.println("f2 en decimal: " + f2.convertirADecimal());
        Fraccion f3 = Fraccion.parseFraccion("4/5");
        System.out.println("f3 parseada = " + f3);
        System.out.println("¿f2 es inversa de f3? " + f2.esInverso(f3));
        System.out.println("Multiplicar f2 y f3: " + f2.multiplica(f3));
        System.out.println("Dividir f2 entre f3: " + f2.divide(f3));
    }
}
