package ejemploTypeCastingAndPromotion;

public class TypeCastingAndPromotionTest {
    public static void main(String[] args) {
        int n1 = 55555;
        int n2 = 66666;
        long n3 = (long)n1 * n2;

        System.out.println(n3);
    }

    public static long multiplicar(int n1, long n2){
        long n3 = n1 * n2;
        if(n3 < 0){
            return n3 * -1;
        }

        return n3;
    }

    public static void deberiaImprimirTrueAlMultiplicarCuatroDigitos(){
        //DADOS
        int n1 = 9999;
        int n2 = 9999;
        long resultadoEsperado = 99_980_001;

        //CUANDO
        long resultado = multiplicar(n1, n2);

        //ENTONCES
        System.out.println(resultado == resultadoEsperado);
    }

    public static void deberiaImprimirTrueAlMultiplicarCincoDigitos(){
        //DADOS
        int n1 = 99999;
        int n2 = 99999;
        long resultadoEsperado = 9_999_800_001L;

        //CUANDO
        long resultado = multiplicar(n1, n2);

        //ENTONCES
        System.out.println(resultado == resultadoEsperado);
    }

    public static void deberiaImprimirTrueAlMultiplicarNumerosNegativos(){
        //DADOS
        int n1 = -1;
        int n2 = 2;
        int resultadoEsperado = 2;

        //CUANDO
        long resultado = multiplicar(n1, n2);

        //ENTONCES
        System.out.println(resultado == resultadoEsperado);
    }
}
