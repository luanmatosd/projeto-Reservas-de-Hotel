package br.com.projeto.reservas.model;

public class QuartoStandard extends Quarto {

    public QuartoStandard(String andar, String numero, double precoPorNoite) {
        super(andar, numero, precoPorNoite); // Classe filha apontando para o construtor da Mãe
    }

    // Sobrescrita do método abstrato da Classe Mãe
    @Override
    public String exibeDetalhesDoQuarto() {
        return "Quarto Standard com cama de casal, TV, e Wi-Fi gratuito.";
    }

    @Override
    public void exibeDetalhes() {
        System.out.println("Andar: " + super.getAndar() + ", Número: " + super.getNumero()
                + ", Preço: " + super.getPrecoPorNoite()); // Super indicando atributo da classe Mãe
    }
}
