package ejemploJavaTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class PruebaJavaTime {
    public static void main(String[] args) {
        LocalDate fechaDeHoy = LocalDate.now();
        LocalDate fechaDeAyer = fechaDeHoy.minusDays(1);
        LocalDate fechaDePasadoMañana = fechaDeHoy.plusDays(2);
        LocalDate fechaCualquiera = LocalDate.of(2022, 12, 24);

        LocalTime tiempo = LocalTime.now();

        System.out.println(tiempo);

        System.out.println(fechaDeAyer);

        System.out.println(fechaDePasadoMañana);

        System.out.println(fechaCualquiera);
    }
}
