package ejemploClasesAbstractas;


public class PruebaClasesAbstractas {
    public static void main(String[] args) {
        Producto gaseosa = new Refresco(60, "Bebida", "Kola Román", 3);
        Producto gaseosa2 = new Refresco(50, "Bebida", "La Casera", 2);
        Producto gaseosa3 = new Refresco(50, "Bebida", "La Casera", 2);
        Producto gaseosa4 = gaseosa3;
        Producto mangos = new Fruta(10, "Fruta", "Mango", 4);
        Producto atún = new LataDeAtun(50, "Lata de Atún", "Atún Van Camps", 500);

        CajaRegistradora caja = new CajaRegistradora();

        caja.mostrarPrecioPorUnidad(gaseosa);
        caja.mostrarPrecioPorUnidad(mangos);
        caja.mostrarPrecioPorUnidad(atún);

        System.out.println(mangos);
        System.out.println(gaseosa);
        System.out.println(gaseosa2);
        System.out.println(gaseosa.equals(gaseosa2));
        System.out.println(gaseosa2.equals(gaseosa3));
        System.out.println(gaseosa4.equals(gaseosa3));

    }
}
