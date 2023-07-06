package ejemploDeInterfacesFuncionales;

public class Manzana {

    public final static String ROJA = "R";
    public final static String VERDE = "V";
    private String color;
    private Integer peso;

    public Manzana(String color, Integer peso) {
        this.color = color;
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Manzana{" +
                "color='" + color + '\'' +
                ", peso=" + peso +
                '}';
    }
}
