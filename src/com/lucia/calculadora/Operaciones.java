package com.lucia.calculadora;

/**
 * Calculadora
 *
 * @author Lucía Balsa Martínez
 * @version 10.02.2023
 */
public class Operaciones {

    /**
     * Declaro la contante literal de resultado con valor null
     */
    private static Float resultado = null;

    /**
     * Declaro la contante literal de suma con valor 1
     */
    static final int SUMA = 1;

    /**
     * Declaro la contante literal de resta con valor 2
     */
    static final int RESTA = 2;

    /**
     * Declaro la contante literal de multiplicacion con valor 3
     */
    static final int MULTIPLICACION = 3;

    /**
     * Declaro la contante literal de division con valor 4
     */
    static final int DIVISION = 4;

    /**
     * Declaro la contante literal de raiz con valor 5
     */
    static final int RAIZ = 5;

    /**
     * @param device --> operación que voy a hacer (SUMA,RESTA,MULTIPLICACIÓN,DIVISIÓN)
     * @param num1   --> primer número de la operación
     * @param num2   --> segundo número de la operación
     * @return resultado
     */

    public static Float calcular(int device, Float num1, Float num2) {
        switch (device) {
            case SUMA:
                try {
                    resultado = num1 + num2;
                } catch (Exception e) {
                    System.out.println("Error");
                }
                break;

            case RESTA:
                try {
                    resultado = num1 - num2;
                } catch (Exception e) {
                    System.out.println("Error");
                }
                break;

            case MULTIPLICACION:
                try {
                    resultado = num1 * num2;
                } catch (Exception e) {
                    System.out.println("Error");
                }
                break;

            case DIVISION:
                try {
                    resultado = num1 / num2;
                } catch (Exception e) {
                    System.out.println("Error");
                }
                break;

            case RAIZ:
                try {
                    resultado = (float) Math.pow(num1, (double) (1 / num2));
                } catch (Exception e) {
                    System.out.println("Error");
                }
                break;

        }

        return resultado;
    }
}
