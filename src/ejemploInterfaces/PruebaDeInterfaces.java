package ejemploInterfaces;

import ejemploClasesFinales.A;
import ejemploInterfaces.interfacesgenerales.ObjetoVolador;
import ejemploInterfaces.mediosdetransporte.Helicoptero;
import ejemploInterfaces.mediosdetransporte.Hidroavión;
import ejemploInterfaces.simuladoraviario.Pájaro;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class PruebaDeInterfaces {
    public static void main(String[] args) {
        ArrayList<ObjetoVolador> objetosQueVuelan = new ArrayList<>();
        //No importa si uso otra subclase de List, el resultado será el mismo. Comenta la línea 16 y descomenta cualquiera de las líneas 18 y 19 y observa qué pasa.
//        Vector<ObjetoVolador> objetosQueVuelan = new Vector<>();
//        LinkedList<ObjetoVolador> objetosQueVuelan = new LinkedList<>();

        Pájaro canario = new Pájaro();
        Hidroavión hidroAvion = new Hidroavión();
        Helicoptero helicoptero = new Helicoptero();

        objetosQueVuelan.add(canario);
        objetosQueVuelan.add(helicoptero);
        objetosQueVuelan.add(hidroAvion);

        simularOtroProyecto(objetosQueVuelan);
    }

    //Imaginemos que en ese otro proyecto solo tienen la interfaz ObjetoVolador

    public static void simularOtroProyecto(List<ObjetoVolador> objetos){//Usando la interfaz como tipo de datos hacemos los programas mas flexibles y modulares.
        for (ObjetoVolador obj : objetos){
            obj.volar();
        }
    }
}
