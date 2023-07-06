package ejemploDeInterfacesFuncionales;

import java.util.function.Predicate;

public class FiltrosDeManzana {

    public final static Predicate<Manzana> POR_COLOR_ROJO =  m -> m.getColor().equals(Manzana.ROJA);

    public final static Predicate<Manzana> POR_COLOR_VERDE =  m -> m.getColor().equals(Manzana.VERDE);

    public final static Predicate<Manzana> POR_PESO_MAX =  m -> m.getPeso() <= 15;

    public final static Predicate<Manzana> POR_PESO_MIN =  m -> m.getPeso() >= 10;

}
