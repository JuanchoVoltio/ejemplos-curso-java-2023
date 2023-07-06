package ejemploClasesAbstractas;

import java.util.Objects;

public class Fruta extends Producto{
    private double cantidad;

    public Fruta(int precio, String categoría, String nombre, int cantidad) {
        super(precio, categoría, nombre);
        this.setCantidad(cantidad);
    }

    @Override
    public void mostrarPrecioPorUnidadDeMedida(){
        System.out.println("El precio por " + getNombre() + " es de " + getPrecio()/cantidad);
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fruta)) return false;
        if (!super.equals(o)) return false;
        Fruta fruta = (Fruta) o;
        return Double.compare(fruta.getCantidad(), getCantidad()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCantidad());
    }
}
