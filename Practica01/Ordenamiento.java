package Practica01;

public class Ordenamiento {
    public static void main(String[] args) {
        int[] numeros = new int[100000];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() * 100000);}

        Cronometro cronometro = new Cronometro();

        cronometro.inicia();
        for (int i = 0; i < numeros.length - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[minimo]) {
                    minimo = j; }
            }
            int temporal = numeros[i];
            numeros[i] = numeros[minimo];
            numeros[minimo] = temporal;
        }
        
        cronometro.detener();
        
        System.out.println(
            "Tiempo de ordenación fue de " +
            cronometro.lapsoDeTiempo() +
            " milisegundos"
        );
    }
}
