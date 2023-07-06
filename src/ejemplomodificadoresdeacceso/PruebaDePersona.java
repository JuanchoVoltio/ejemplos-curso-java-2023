package ejemplomodificadoresdeacceso;

import ejemplomodificadoresdeacceso.paquetex.Perrito;

public class PruebaDePersona {
    public static void main(String[] args) {
        Persona yo = new Persona();
        Perrito perrito = new Perrito();

        //perrito.nombre; // Esto genera error.

        yo.setEdad(80);
        yo.setNombre("Fulanito");

        System.out.println("La edad de " + yo.getNombre() + " es: " + yo.getEdad());
    }
}
