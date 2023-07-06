package ejemploClasesAbstractas;

public class LataDeAtun extends Producto {
    private double peso;

    public LataDeAtun(int precio, String categoría, String nombre, double peso) {
        super(precio, categoría, nombre);
        this.peso = peso;
    }

    @Override
    public void mostrarPrecioPorUnidadDeMedida(){
        System.out.println("El precio por gramo es de " + getPrecio()/peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
