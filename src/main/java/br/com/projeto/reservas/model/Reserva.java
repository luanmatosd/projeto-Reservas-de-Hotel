package br.com.projeto.reservas.model;

import br.com.projeto.reservas.control.Exibivel;

import java.time.LocalDate;

public class Reserva implements Exibivel {
    private Quarto quarto; // Composição de Objetos
    private Hospede hospede; // Composição de Objetos
    private LocalDate dataCheckIn;
    private LocalDate dataCheckOut;
    private static int contadorDeReservas; // Atributo estático

    public Reserva(Quarto quarto, Hospede hospede, LocalDate dataCheckIn, LocalDate dataCheckOut) {
        this.quarto = quarto;
        this.hospede = hospede;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
        Reserva.contadorDeReservas++;
    }

    @Override
    public void exibeDetalhes() {
        System.out.println(quarto.exibeDetalhesDoQuarto());
        quarto.exibeDetalhes();
        hospede.exibeDetalhes();
        System.out.println("Data - CheckIn: " + dataCheckIn);
        System.out.println("Data - CheckOut: " + dataCheckOut);
        System.out.println("Preço Estadia à vista (20% desconto): R$ " + calculaEstadia(20));
        System.out.println("Preço Estadia - Parcelado: R$ " + calculaEstadia());
        System.out.println();
    }

    // Método de calcular estadia
    public double calculaEstadia() {
        int diff = this.dataCheckOut.getDayOfMonth() - this.dataCheckIn.getDayOfMonth();
        return diff * this.quarto.getPrecoPorNoite();
    }

    // Sobrecarga do método calculaEstadia 20% de desconto na reserva
    public double calculaEstadia(double percentual) {
        double valorEstadia = calculaEstadia();
        return valorEstadia - (valorEstadia * percentual / 100);
    }

    // Método estático responsável por calcular o total de Reservas realizadas
    public static int exibeTotalDeReservas() {
        return Reserva.contadorDeReservas;
    }
}
