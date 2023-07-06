package ascensor.v2;

import ascensor.v1.Ascensor;

public class AscensorV2 extends Ascensor {

    private boolean puertaCerrada;

    @Override
    public void subir(){
//        if(puertaCerrada) {
//            System.out.println("Subiendo....");
//            int pisoActual = getPisoActual();
//            pisoActual++;
//            setPisoActual(pisoActual);
//        }

        if(puertaCerrada) {
            super.subir();
        }
    }

    @Override
    public void bajar(){
//        if(puertaCerrada) {
//            System.out.println("Bajando....");
//            int pisoActual = getPisoActual();
//            pisoActual--;
//            setPisoActual(pisoActual);
//        }
        if(puertaCerrada) {
            super.bajar();
        }
    }

    public void abrirLaPuerta(){
        System.out.println("Abriendo la puerta....");
        puertaCerrada = false;
        System.out.println("Puerta abierta.");
    }

    public void cerrarLaPuerta(){
        System.out.println("Cerrando la puerta....");
        puertaCerrada = true;
        System.out.println("Puerta cerrada.");
    }

}
