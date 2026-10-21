package Practica02;
/*La Clase Fraccion .
* @author Juan Perez
* @version 1.0 03/03/2026*/
public class Fraccion {
// Atributos
private int numerador ;
private int denominador ;
// M´etodos
/* Construye una nueva fraccion */
public Fraccion () {
this . numerador = 0;
this . denominador = 1;
}
/* Construye una nueva fraccion */
public Fraccion ( int n , int d ) {
this . numerador = n ;
this . denominador = d ;
}
/*1 Comprueba si dos fracciones son iguales . 
* @param o Object , otro objeto .
* @return true si las fracciones son iguales .*/
@Override
public boolean equals ( Object o ) {
if ( o instanceof Fraccion ) {
Fraccion f = ( Fraccion ) o ;
return f . numerador == this . numerador && f . denominador == this .
denominador ;
} else
return false ;
}
/*Retorna la representaci´on de Cadena del objeto Fraccion .
* @return String , la fracci´on en formato de cadena .*/
@Override
public String toString () {
return String . format (" %d/ %d", this . numerador , this . denominador ) ;
}
/* Suma dos fracciones .
* @param o Fraccion , contiene la otra fraccion .
* @return Fraccion resultante .*/
public Fraccion suma ( Fraccion o ) {
int n = ( this . numerador * o . denominador ) + ( this . denominador * o .
numerador ) ;
int d = this . denominador * o . denominador ;
return new Fraccion (n , d ) ;
}
/* Resta dos fracciones .
* @param o Fraccion , contiene la otra fracci´on .
* @return c Fraccion resultante .*/
public Fraccion resta ( Fraccion o ) {
Fraccion c = new Fraccion () ;
c . numerador = ( this . numerador * o . denominador ) - ( this . denominador *
o . numerador ) ;
c . denominador = this . denominador * o . denominador ;
return c ;
}
    // LABORATORIO 2
    //a) Multiplicacion de fracciones
    public Fraccion multiplica(Fraccion o) {
        int n = this.numerador * o.numerador;
        int d = this.denominador * o.denominador;
        return new Fraccion(n, d);
    }
    //b) Division de fracciones
    public Fraccion divide(Fraccion o) {
        if (o.numerador == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        int n = this.numerador * o.denominador;
        int d = this.denominador * o.numerador;
        return new Fraccion(n, d);
    }
    // c) De fraccion a decimal
    public double convertirADecimal() {
        if (this.denominador == 0) {
            throw new ArithmeticException("División por cero");
        }
        return (double) this.numerador / this.denominador;
    }
    // d) Verificar si es inverso
    public boolean esInverso(Fraccion o) {
        Fraccion producto = this.multiplica(o);
        return producto.equals(new Fraccion(1, 1));
    }
    // e) Conversión de cadena a fracción
    public static Fraccion parseFraccion(String str) {
        String[] parts = str.trim().split("/");
        int num = Integer.parseInt(parts[0]);
        int den = Integer.parseInt(parts[1]);
        return new Fraccion(num, den);
    }
    // f) Simplificacion de fracciones
    public Fraccion simplifica() {
        int mcd = mcd(this.numerador, this.denominador);
        return new Fraccion(this.numerador / mcd, this.denominador / mcd);
    }

    private int mcd(int a, int b) {
        if (b == 0)
            return a;
        return mcd(b, a % b);
    }
}