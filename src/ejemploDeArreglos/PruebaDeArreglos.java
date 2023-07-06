package ejemploDeArreglos;

public class PruebaDeArreglos {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40};
        int[] numeros2 = {100, 75, 50, 25, 0};
        int[] numeros3 = {1, 3, 6, 5, 10, 7, 11, 13};

//        imprimirUltimoElemento(numeros3);
//        imprimirElArregloConForClasico(numeros);
//
//        imprimirElArregloConForMejorado(numeros);

//        probarLaInstruccionBreak(numeros);

        probarLaInstruccionContinue(numeros3);
    }

    public static void probarLaInstruccionContinue(int[] arreglo){
//        Vamos a imprimir los números que sean pares;
        for (int numero : arreglo){
            if(numero % 2 != 0){
                continue;
            }
            System.out.println(numero);
        }
    }

    public static void probarLaInstruccionBreak(int[] arreglo){
//        Vamos a imprimir los números hasta que haya un valor mayor que 25;
        for (int numero : arreglo){
            System.out.println(numero);
            if(numero > 25){
                break;
            }
        }
    }

    public static void imprimirElArregloConForMejorado(int[] arreglo){

        System.out.print("[ ");

        for(int elementoActual : arreglo){
            System.out.print(elementoActual + " ");
        }

        System.out.println("]");
    }

    public static void imprimirElArregloConForClasico(int[] arreglo){

        System.out.print("[ ");

        for(int i = 0; i < arreglo.length; i += 1){
            System.out.print(arreglo[i] + " ");
        }

        System.out.println("]");
    }

    public static void imprimirUltimoElemento(int[] arreglo){
        int i = arreglo.length - 1;
        System.out.println(arreglo[0]);
    }


}
