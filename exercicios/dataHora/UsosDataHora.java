package exercicios.dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class UsosDataHora {
    public static void main(String[] args) {

        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        //Formatacao
        DateTimeFormatter formato01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formato02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formato03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        //instanciacao
        //Pega apenas data padrao aa/mm/dd
        LocalDate d01 = LocalDate.now();
        System.out.println(d01);
        //Pega dia e horario LOCAL
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println(d02);
        //Pega dia e horario padrao UTC (LONDRES)
        Instant d03 = Instant.now();
        System.out.println(d03);

        //Data como parametro
        LocalDate d04 = LocalDate.parse("2022-07-20");
        System.out.println(d04);
        //Data hora como parametro
        LocalDateTime d05 = LocalDateTime.parse("2023-06-06T05:30:40");
        System.out.println(d05);
        //Data hora como parametro padrao UTC (londres)
        Instant d06 = Instant.parse("2023-06-06T05:30:40z");
        System.out.println(d06);
        //Data hora como parametro padrao UTC (londres) alterando a timezone
        Instant d07 = Instant.parse("2023-06-06T05:30:40-03:00");
        System.out.println(d07);
        //Instanciado com formato customizado na linha 14
        LocalDate d08 = LocalDate.parse("06/06/2023", formato01);
        System.out.println(d08);
        //Instanciado com formato customizado na linha 15
        LocalDateTime d09 = LocalDateTime.parse("06/06/2023 05:30", formato02);
        System.out.println(d09);

        //A partir de dados isolados
        LocalDate d10 = LocalDate.of(2022, 7, 20);
        System.out.println(d10);

        LocalDateTime d11 = LocalDateTime.of(2023,06,23,10,41);
        System.out.println(d11);

        //apresentando uma data num formato pre definido
        System.out.println(d01.format(formato01));
        System.out.println(formato01.format(d01));
        System.out.println(d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println(d05.format(formato02));
        System.out.println(formato02.format(d05));
        System.out.println(d05.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

        //no caso de Instant que usa zonas gmt usar formato da linha 16
        System.out.println(formato03.format(d03));

    }
}
