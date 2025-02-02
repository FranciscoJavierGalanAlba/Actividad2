package javabean;

import java.util.Scanner;

/**
 *  Clase cuya función es la de sumar numeros, ya sean enteros o
 *  reales
 * @author Francisco Javier Galan Alba (FranciscoJavierGalanAlba)
 * @version 0.2 segunda version
 */

public class Suma {
    private Double suma;

    /**
     * Metodo cuya funcion es sumar dos numeros reales
     * Recibe dos numeros, el programa realiza la suma y devuelve
     * la suma de ambos numeros.
     *
     * @param num1 es el primer numero que se recibe
     * @param num2 es el segundo numero que se recibe
     *
     * @return Devuelve la suma de los dos numeros.
     */

    public Double sumaRealesDos(double num1, double num2){

        Double suma = num1 + num2;

        System.out.println("La suma de los numeros: " + num1 +
                " y " + num2 + " es: "  );

        return suma;
    }

    /**
     * Recice dos numeros enteros, el programa realiza la suma y
     * devuelve dicha suma
     * El programa realiza una condicion, si ambos numeros son
     * positivos devuelve la suma de ambos numeros.
     * Si al menos uno de los numeros o los dos son negativos,
     * devuelve un null.
     *
     * @param num1 es el primer numero que se recibe
     * @param num2 es el segundo numero que se recibe
     *
     * @return devuelve la suma de dos numeros enteros
     */

    public int sumaEnteros(int num1, int num2){
        if(num1>=0 && num2>=0){
            int suma = num1 + num2;

            System.out.println("La suma de los numeros: " + num1 +
                    " y " + num2 + " es: " );

            return suma;

        } else{
            System.out.println("Introduce numeros positivos");
            return -1;
        }

    }

    /**
     * Se recibe tres numeros reales. El programa realiza la suma
     * y devuelve la suma de los numeros.
     *
     * @param num1 es el primer numero que se recibe
     * @param num2 es el segundo numero que se recibe
     * @param num3 es el tercer numero que se recibe
     *
     * @return devuleve la suma de tres numeros reales
     */
    public Double sumaRealesTres(double num1, double num2, double num3){
        Double suma = num1 + num2 + num3;

        System.out.println("La suma de los numeros: " + num1 +
                " + " + num2 + " + " + num3 + " es: " );

        return suma;
    }
}
