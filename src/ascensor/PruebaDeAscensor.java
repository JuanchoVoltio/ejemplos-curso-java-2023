package ascensor;

import ascensor.v1.Ascensor;
import ascensor.v1punto5.AscensorV1punto5;
import ascensor.v2.AscensorV2;
import ascensor.v3.AscensorV3;

public class PruebaDeAscensor {
    public static void main(String[] args) {

        Ascensor a1 = new Ascensor();
        Ascensor a2 = new Ascensor();
        Ascensor a3 = new AscensorV3();
        Ascensor aV2 = new AscensorV2();

        metodoParaProbarElProblemaDelPolimorfismo(aV2);
        metodoParaProbarElProblemaDelPolimorfismo(a3);
//        a1.getPisoActual();
//        a2.getPisoActual();
//        a3.getPisoActual();


//        probandoAscensorV1ParaClienteAntiguo();

//        System.out.println();
//
//        probandoAscensorV2ParaClienteModerno();

//        probandoAscensorV1puntoCinco();
    }

    public static void metodoParaProbarElProblemaDelPolimorfismo(Ascensor a){
        if(a instanceof AscensorV3) {
            System.out.println("Voy a convertir la variable a -> AscensorV3");
            AscensorV3 aV3 = (AscensorV3) a;
            aV3.irAlPisoDeseado(5);
        }
        System.out.println("-- FIN --");
    }

    public static void probandoAscensorV2ParaClienteModerno(){
        AscensorV2 ascensor2 = new AscensorV2();

        System.out.println("El ascensor está en el el piso: " + ascensor2.getPisoActual());

        ascensor2.cerrarLaPuerta();

        ascensor2.subir();
        ascensor2.subir();
        ascensor2.subir();
        ascensor2.subir();
        ascensor2.subir();
        ascensor2.subir();

        System.out.println("El ascensor está en el el piso: " + ascensor2.getPisoActual());

        ascensor2.bajar();

        System.out.println("El ascensor está en el el piso: " + ascensor2.getPisoActual());

        System.out.println("--- FIN ---");
    }

    public static void probandoAscensorV1ParaClienteAntiguo(){
        Ascensor ascensor1 = new Ascensor();

        System.out.println("El ascensor está en el el piso: " + ascensor1.getPisoActual());

        ascensor1.subir();
        ascensor1.subir();
        ascensor1.subir();
        ascensor1.subir();

        System.out.println("El ascensor está en el el piso: " + ascensor1.getPisoActual());

        ascensor1.bajar();

        System.out.println("El ascensor está en el el piso: " + ascensor1.getPisoActual());

        System.out.println("--- FIN ---");
    }

    public static void probandoAscensorV1puntoCinco(){
        Ascensor ascensor1 = new AscensorV1punto5();

        System.out.println("El ascensor está en el el piso: " + ascensor1.getPisoActual());

        ascensor1.subir();
        ascensor1.subir();

        System.out.println("El ascensor está en el el piso: " + ascensor1.getPisoActual());

        ascensor1.bajar();

        System.out.println("El ascensor está en el el piso: " + ascensor1.getPisoActual());

        System.out.println("--- FIN ---");
    }

    public static void probandoAscensorV3(){
        AscensorV3 ascensor = new AscensorV3();
        int pisoDeseado = 3;

        System.out.println("El ascensor está en el el piso: " + ascensor.getPisoActual());

        ascensor.irAlPisoDeseado(pisoDeseado);

        System.out.println("El ascensor está en el el piso: " + ascensor.getPisoActual());

        System.out.println("--- FIN ---");
    }
}