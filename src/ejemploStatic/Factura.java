package ejemploStatic;

public class Factura {
    private int nroDeFactura;
    private int montoBruto;
    public static final double IVA_GENERAL = 0.19;

    public static double ivaLocal;

    public Factura(int nroDeFactura, int montoBruto) {
        this.nroDeFactura = nroDeFactura;
        this.montoBruto = montoBruto;
    }

    public int getNroDeFactura() {
        return nroDeFactura;
    }

    public void setNroDeFactura(int nroDeFactura) {
        this.nroDeFactura = nroDeFactura;
    }

    public int getMontoBruto() {
        return montoBruto;
    }

    public void setMontoBruto(int montoBruto) {
        this.montoBruto = montoBruto;
    }

    //Vamos a calcular el monto neto que se debe pagar de una factura que existe
    public double facturar(){
        return montoBruto * (1 + IVA_GENERAL);
    }

    //Vamos a cotizar de un valor de un producto. No existe aún la factura.
    public static double cotizar(int precioBase){
        return precioBase * (1 + IVA_GENERAL);
    }
}
