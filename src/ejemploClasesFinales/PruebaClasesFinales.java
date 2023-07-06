package ejemploClasesFinales;

import ejemploClasesFinales.malicioso.D;

public class PruebaClasesFinales {
    public static void main(String[] args) {
        ImpresoraDeClases impresora = new ImpresoraDeClases();
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
        D obj4 = new D();

        impresora.imprimir(obj1);
        impresora.imprimir(obj2);
        impresora.imprimir(obj3);
        impresora.imprimir(obj4);
    }
}
