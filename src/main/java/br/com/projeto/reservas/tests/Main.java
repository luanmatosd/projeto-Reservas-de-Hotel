package br.com.projeto.reservas.tests;

import br.com.projeto.reservas.model.Hospede;
import br.com.projeto.reservas.model.QuartoDeluxe;
import br.com.projeto.reservas.model.QuartoStandard;
import br.com.projeto.reservas.model.Reserva;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Criando Quartos
        QuartoDeluxe quartoDeluxe = new QuartoDeluxe("5", "174", 590.90);
        QuartoStandard quartoStandard = new QuartoStandard("2", "55", 125.90);

        // Criando Hóspedes
        Hospede leonardo = new Hospede("Leonardo", "leonatel@gmail.com",
                "11 92526-6610", "478.987.785-09");
        Hospede ana = new Hospede("Ana", "anamaria@gmail.com",
                "11 98899-4411", "444.587.221-11");

        // Manipulando Datas
        LocalDate checkIn = LocalDate.of(2024, 5, 5);
        LocalDate checkOut = LocalDate.of(2024, 5, 25);

        // Criando Reservas
        Reserva reservaUm = new Reserva(quartoDeluxe, leonardo, checkIn, checkOut);
        Reserva reservaDois = new Reserva(quartoStandard, ana, checkIn, checkOut);

        // Exibindo detalhes das reservas
        System.out.println("Detalhes - Reserva 1:");
        reservaUm.exibeDetalhes();

        System.out.println("Detalhes - Reserva 2:");
        reservaDois.exibeDetalhes();

        // Exibindo total de Reservas
        System.out.println("Total de Reservas: " + Reserva.exibeTotalDeReservas());
    }
}
