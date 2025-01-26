package javabean;

/** Clase que proporciona operación de división de una calculadora.
 * @author Alberto Velasco
 * @version 0.1
 */
public class Cociente {
    

    /**
     * Método Calcular hace la división entre dos números enteros y devuelve el resultado.
     * @param numerador Numerador de la división.
     * @param divisor Divisor de la división.
     * @return {@code integer} si la operación fue exitosa, {@code -1} si el divisor es 0 o un número negativo
     */

    public double calcular(int numerador, int divisor) {
        /**
         * En el caso que el divisor sea 0, devolvemos un -1
         */
        if (divisor == 0) {
            return -1;
        }
        return numerador / divisor;
    }


    /**
     * Método esError para verificar si ocurrió un error en el cálculo de la división
     * entre dos números enteros y devuelve el resultado.
     * @param numerador Numerador de la división.
     * @param divisor Divisor de la división.
     * @return {@code true} si hay un error, {@code false} si no hay error
     */
    public boolean esError(double resultado, double divisor) {
        return divisor == 0 || resultado == -1;
    }
}



