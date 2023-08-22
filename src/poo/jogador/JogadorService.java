package poo.jogador;

public class JogadorService {
    public static void main(String[] args) {
        var jogador = new Jogador();
        jogador.setNome("João");
        jogador.setIdade(18);
        jogador.setNomeTime("São Paulo");

        System.out.println("O nome do jogador: " + jogador.getNome()
                + "\nA idade do jogador: " + jogador.getIdade()
                + "\nO nome do time do jogador: " + jogador.getNomeTime());
    }
}
