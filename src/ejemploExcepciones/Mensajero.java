package ejemploExcepciones;

public class Mensajero {
    public static String generarMensaje(String nombre){
        System.out.println("Se ha invocado el método generarMensaje()");
        return "El alumno buscado se llama " + nombre;
    }
}
