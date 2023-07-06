package ejemploConstructores;

public class SerVivo {

    public String nombre;
    public final String NOMBRE_CIENTIFICO;

    public SerVivo(String nombreCientifico, String nombre){
        NOMBRE_CIENTIFICO = nombreCientifico;
        this.nombre = nombre;
    }
}
