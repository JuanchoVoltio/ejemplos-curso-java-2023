package ejemploClasesAbstractas;

import java.util.Objects;

public abstract class Producto {
    private int precio;
    private String categoría;
    private String nombre;

    public Producto(int precio, String categoría, String nombre) {
        this.precio = precio;
        this.categoría = categoría;
        this.nombre = nombre;
    }

    public abstract void mostrarPrecioPorUnidadDeMedida();


    /* GETTERS Y SETTERS*/

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return getPrecio() == producto.getPrecio() && Objects.equals(getCategoría(), producto.getCategoría()) && Objects.equals(getNombre(), producto.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrecio(), getCategoría(), getNombre());
    }
}
