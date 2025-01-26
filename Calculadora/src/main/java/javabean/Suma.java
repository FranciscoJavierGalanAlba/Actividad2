package javabean;

/**
 *  Clase cuya función es la de sumar dos numeros
 * @autor Francisco Javier Galan Alba (FranciscoJavierGalanAlba)
 * @version 0.1
 */

public class Suma {
    private Double suma;
    /**
     * Método cuya función es recibir dos numeros y mostrar por pantalla
     * la suma de ambos.
     *
     * @param num1 es el primer numero que se recibe
     * @param num2 es el segundo numero que se recibe
     *
     */
    public Double sumando(double num1, double num2){

        /**
         * Creo un condicional.
         *
         * Si ambos numeros son positvos, el metodo devuelve la suma de ambos
         *
         * Si uno o ambos de los numeros es negativo, me devuelve null
         */
        if(num1>=0 && num2>=0){
            suma = (num1 + num2);
            System.out.println("La suma de los numeros: " + num1 +
                    " y " + num2 + " es: " );
            return (num1 + num2);
        } else{
            return null;
        }
        
    }
}
