package ascensor.v1;

public class Ascensor {

    private int pisoActual = 1;
    public final int PISO_MAXIMO = 4;
    public final int PISO_MINIMO = 1;

    public void subir(){
        if(pisoActual < PISO_MAXIMO) {
            System.out.println("Subiendo....");
            pisoActual++; // Equivale a '+= 1'
        }else{
            System.out.println("Ya estás en el último piso");
        }
    }

    public void bajar(){
        if(pisoActual > PISO_MINIMO) {
            System.out.println("Bajando....");
            pisoActual--; //Equivale a '-= 1'
        }else{
            System.out.println("Ya estás en el primer piso");
        }
    }

    public int getPisoActual(){
        return pisoActual;
    }

    protected void setPisoActual(int pisoActual){
        this.pisoActual = pisoActual;
    }
}
