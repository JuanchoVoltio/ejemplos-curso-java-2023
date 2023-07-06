package ejemploClasesAbstractas;

public class Refresco extends Producto{

    private int volumen;

    public Refresco(int precio, String categoría, String nombre, int volumen) {
        super(precio, categoría, nombre);
        this.volumen = volumen;
    }

    @Override
    public void mostrarPrecioPorUnidadDeMedida(){
        System.out.println("El precio por litro es de " + getPrecio()/volumen);
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString(){
        return "{categoria=" + getCategoría() + ", nombre=" + getNombre()
                + ", volumen(lts)=" + volumen + ", precio=" + getPrecio() + "}";
    }

    @Override
    public boolean equals(Object obj){
        Refresco r;

        if(obj == this){
            return true;
        }else if(obj instanceof Refresco){
            r = (Refresco) obj;
            boolean respuesta = (r.getNombre().equals(this.getNombre())) && (r.volumen == this.volumen);
            return respuesta;
        }else{
            return false;
        }

    }
}
