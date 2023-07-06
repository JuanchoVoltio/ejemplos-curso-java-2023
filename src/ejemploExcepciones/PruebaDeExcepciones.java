package ejemploExcepciones;

import java.util.Scanner;

public class PruebaDeExcepciones {
    public static void main(String[] args) {
        System.out.println("--- INICIANDO EL PROGRAMA ---");

        Scanner entrada = new Scanner(System.in);

        int nroDelAlumno = -1;

        System.out.print("Indique el nro del alumno: ");
        try {
            nroDelAlumno = entrada.nextInt();
        } catch (Exception ex){
            System.out.println("Ha ocurrido un error, ejecute el programa nuevamente.");
        }

        SalonDeClase salonDeClase = new SalonDeClase();

        String nombreDelAlumno = "";

        nombreDelAlumno = salonDeClase.consultarElAlumnoPorNroDeLista(nroDelAlumno);

        System.out.println(Mensajero.generarMensaje(nombreDelAlumno));

        System.out.println("--- PROGRAMA FINALIZADO ---");
    }
}
