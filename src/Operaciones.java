
/**
 * Calculadora
 *
 * @author Lucía Balsa Martínez
 * @version 10.02.2023
 */
public class Operaciones {

    /**
     * Declaro atributos y constantes para usar en el switch
     */

    private static Float resultado = null;
    static final int SUMA = 1;
    static final int RESTA = 2;
    static final int MULTIPLICACION = 3;
    static final int DIVISION = 4;

    /**
     * @param device --> operación que voy a hacer (SUMA,RESTA,MULTIPLICACIÓN,DIVISIÓN)
     * @param num1   --> primer número de la operación
     * @param num2   --> segundo número de la operación
     * @return resultado
     */

    public static Float calcular(int device, float num1, float num2) {
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
        }
        return resultado;
    }
}
