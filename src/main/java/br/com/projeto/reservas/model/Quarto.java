package br.com.projeto.reservas.model;

import br.com.projeto.reservas.control.Exibivel;

public abstract class Quarto implements Exibivel { // Classe abstrata

    private String numero;
    private String andar;
    private double precoPorNoite;

    // Construtor da Classe Mãe
    protected Quarto(String andar, String numero, double precoPorNoite) {
        this.andar = andar;
        this.numero = numero;
        this.precoPorNoite = precoPorNoite;
    }

    public String getNumero() {
        return numero;
    }

    public double getPrecoPorNoite() {
        return precoPorNoite;
    }

    public String getAndar() {
        return andar;
    }

    // Método abstrato
    public abstract String exibeDetalhesDoQuarto();
}
