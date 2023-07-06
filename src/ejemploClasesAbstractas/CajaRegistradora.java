package ejemploClasesAbstractas;

public class CajaRegistradora {
    public void mostrarPrecioPorUnidad(Producto p){
        System.out.print("Caja Registradora dice: ");
        p.mostrarPrecioPorUnidadDeMedida();
    }
}
