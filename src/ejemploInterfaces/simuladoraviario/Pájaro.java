package ejemploInterfaces.simuladoraviario;

import ejemploInterfaces.interfacesgenerales.ObjetoVolador;

public class Pájaro implements ObjetoVolador {
    @Override
    public void volar() {
        System.out.println("Uso mis alas para volar");
    }
}
