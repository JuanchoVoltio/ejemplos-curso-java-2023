package ejemplomodificadoresdeacceso;

public class Persona {
    private String nombre = "Fulano de tal";
    private int edad = 18;

    public void setEdad(int edad){
        if(edad < 100){
            this.edad = edad;
        }
    }

    public int getEdad(){
        return edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

}
