package ejemploStatic;

public class PruebaDeFactura {
    public static void main(String[] args) {

        System.out.println("IVA General: " + Factura.IVA_GENERAL);
        System.out.println("IVA Local: " + Factura.ivaLocal);
        Factura.ivaLocal = 0.21;
        System.out.println("IVA Local: " + Factura.ivaLocal);
        System.out.println(Factura.cotizar(1000));

        Factura f = new Factura(100, 1000);
        Factura f2 = new Factura(101, 2000);

        f.setMontoBruto(10000);
//
//        System.out.println("Total a pagar: " + f.cotizar(1000));
        System.out.println("Total a pagar: " + f.facturar());

        System.out.println(Math.max(10, 15));
    }
}
