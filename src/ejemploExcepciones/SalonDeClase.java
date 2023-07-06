package ejemploExcepciones;

import java.util.List;

public class SalonDeClase {
    private List<String> alumnos = List.of("Diego", "Sergio", "Lola", "Anton");

    public SalonDeClase() {
        System.out.println("Se ha creado una instancia de SalonDeClase");
    }

    public String consultarElAlumnoPorNroDeLista(int nroDeLista){
        System.out.println("Se ha invocado el método consultarElAlumnoPorNroDeLista()");
        try {
            System.out.println("El método consultarElAlumnoPorNroDeLista() va a retornar: " + alumnos.get(nroDeLista));
            return alumnos.get(nroDeLista);
        } catch(Exception ex){
            System.out.println("Ha ocurrido un error, intente mas tarde");
            System.err.println(ex.getMessage());
            return "";
        }
    }
}
