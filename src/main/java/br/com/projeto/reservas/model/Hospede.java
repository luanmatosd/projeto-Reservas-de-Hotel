package br.com.projeto.reservas.model;

import br.com.projeto.reservas.control.Exibivel;

public class Hospede implements Exibivel {

    private String nome;
    private String cpf;
    private String numeroDeCelular;
    private String email;

    public Hospede(String nome, String email, String numeroDeCelular, String cpf) {
        this.nome = nome;
        this.email = email;
        this.numeroDeCelular = numeroDeCelular;
        this.cpf = cpf;
    }

    @Override
    public void exibeDetalhes() {
        System.out.println("Hóspede: " + nome + ", CPF: " + cpf + ", Celular: " + numeroDeCelular
                + ", E-mail: " + email);
    }
}
