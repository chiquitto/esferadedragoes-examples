package esferadedragoes.java;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class ObterDadosDataJava8 {

    public static void main(String[] args) {

        Date date = new Date();

        // LocalDate localDate = LocalDate.now();
        LocalDate localDate = date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();

        int ano = localDate.getYear();
        System.out.println("ano = " + ano);

        int mes = localDate.getMonthValue();
        System.out.println("mes = " + mes);

        int dia = localDate.getDayOfMonth();
        System.out.println("dia = " + dia);

    }

}
