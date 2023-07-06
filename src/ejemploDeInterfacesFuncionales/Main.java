package ejemploDeInterfacesFuncionales;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Manzana> manzanas = List.of(new Manzana(Manzana.VERDE, 10),
                                         new Manzana(Manzana.ROJA, 15),
                                         new Manzana(Manzana.VERDE, 13),
                                         new Manzana(Manzana.VERDE, 9));

        probarUnConsumer(manzanas);

        probarUnPredicate(manzanas);

        probarEncadenamientoDeStreams(manzanas);
    }

    /**
     * Prueba un Predicate, la cual es una interfaz funcional que recibe un dato y genera un juicio de valor con respuesta true o false.
     * @param manzanas
     */
    public static void probarUnPredicate(List<Manzana> manzanas){
        List<Manzana> resultado = manzanas.stream().filter(m -> m.getPeso() == 10 && m.getColor().equals(Manzana.ROJA)).collect(Collectors.toList());

        System.out.println(resultado);
    }

    /**
     * Prueba un Consumer, el cual es una interfaz funcional que recibe un dato y realiza una acción con estos pero no retorna nada.
     * @param manzanas
     */
    public static void probarUnConsumer(List<Manzana> manzanas){
        manzanas.stream().forEach(m -> System.out.println(m));
    }

    public static void probarEncadenamientoDeStreams(List<Manzana> manzanas){
        manzanas.stream().filter(FiltrosDeManzana.POR_COLOR_VERDE).forEach(m -> System.out.println(m));
    }
}
