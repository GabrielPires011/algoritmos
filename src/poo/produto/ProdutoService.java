package poo.produto;

import java.util.Scanner;

public class ProdutoService {
    public static void main(String[] args) {
        var leia = new Scanner(System.in);
        var total = 0.0;

        for (int i = 1; i < 4; i++) {
            var produto = new Produto();
            System.out.println("Informe o categoria do produto "+i+": ");
            produto.setCategoria(leia.next());
            System.out.print("Informe o nome: ");
            produto.setNome(leia.next());
            System.out.print("Informe o quatidade: ");
            produto.setQuantidade(leia.nextInt());
            System.out.print("Informe o preço: ");
            produto.setPreco(leia.nextDouble());
            total = total + (produto.getQuantidade() * produto.getPreco());
        }
        System.out.println("O valor total dos 3 produtos juntos é: " + total);
    }
}
