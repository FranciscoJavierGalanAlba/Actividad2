package testing;

import javabean.Suma;

import java.util.Scanner;

/**
 * Clase cuya función es probrar las clases de suma, resta,
 * multiplicacion y division
 *
 */
public class Test {

    static Suma suma = new Suma();

    static Scanner scanner = new Scanner(System.in);

    /**
     * metodo cuya funcion es la de correr el progama
     * @param args
     */
    public static void main(String[] args) {
        int opcion = 0;

        System.out.println("Bienvenido a mi menu. ¿Que opcion quieres?:");
        System.out.println("Opcion 1. Suma");
        System.out.println("Opcion 2. Resta");
        System.out.println("Opcion 3. Producto");
        System.out.println("Opcion 4. Cociente");

        opcion = scanner.nextInt();

        do{
            switch (opcion){
                case 1:
                    probandoSumaEntero();
                    probandoSumaReal();
                    probandoSumaRealTres();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    break;
            }

        }while (opcion!=4);



    }


    private static void probandoSumaEntero(){
        System.out.println("Introduce el primer numero entero: ");
        int num1 = scanner.nextInt();
        System.out.println("Introduce el segundo numero entero: ");
        int num2 = scanner.nextInt();
        suma.sumaEnteros(num1, num2);
    }

    private static void probandoSumaReal(){
        System.out.println("Introduce el primer numero real: ");
        double num1 = scanner.nextDouble();
        System.out.println("Introduce el segundo numero real: ");
        double num2 = scanner.nextDouble();
        suma.sumaRealesDos(num1, num2);
    }

    private static void probandoSumaRealTres(){
        System.out.println("Introduce el primer numero real: ");
        double num1 = scanner.nextDouble();
        System.out.println("Introduce el segundo numero real: ");
        double num2 = scanner.nextDouble();
        System.out.println("Introduce el tercer numero real: ");
        double num3 = scanner.nextDouble();

        suma.sumaRealesTres(num1, num2, num3);
    }



}
