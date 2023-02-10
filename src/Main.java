import com.lucia.calculadora.Operaciones;

public class Main {
    public static void main(String[] args) {

        int opcion;
        Float numero1,numero2;
        Float resultado;
        opcion=EntradaSalida.entradaInteger("1-->Suma \n 2-->Resta \n 3-->Multiplicación \n 4-->División");
        numero1=EntradaSalida.entradaFloat("Teclea el primer número");
        numero2=EntradaSalida.entradaFloat("Teclea el primer número");

        if(numero1==null || numero2==null){
            EntradaSalida.salida("Numero equivocado",EntradaSalida.SALIDA_CONSOLA);
        }
        else{
            if(opcion>=1 && opcion<=4){
            resultado= Operaciones.calcular(opcion,numero1,numero2);
                if(Float.isInfinite(resultado)){
                   EntradaSalida.salida("Error",EntradaSalida.SALIDA_CONSOLA);
            } else{
                   EntradaSalida.salida("El resultado es= " +resultado,EntradaSalida.SALIDA_CONSOLA);
            }
        }

        }

    }
}