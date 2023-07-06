package ejemploInterfaces.mediosdetransporte;

import ejemploInterfaces.interfacesgenerales.ObjetoFlotante;
import ejemploInterfaces.interfacesmediosdetransporte.TransportadorDeCarga;

public class Hidroavión extends AparatoVolador implements ObjetoFlotante, TransportadorDeCarga {
    @Override
    public void volar() {
        System.out.println("Utilizo las hélices y mis alas para volar");
    }

    @Override
    public void flotar() {
        System.out.println("Estoy flotando usando dos flotadores como patas");
    }

    @Override
    public void transportar() {

    }
}
