package questao10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Produto estoque[] = new Produto[3]; 

        for (int i = 0; i < estoque.length; i++) {
            estoque[i] = new Produto();
            System.out.println("Nome do produto " + (i+1) + ":");
            String nome = leia.next();
            System.out.println("Quantidade:");
            int qtd = leia.nextInt();
            estoque[i].cadastrar(nome, i, qtd, 10.0, "Geral");
        }

        System.out.println("\nDigite o nome para pesquisar:");
        String busca = leia.next();
        for (int i = 0; i < estoque.length; i++) {
            if ((estoque[i].nome).equalsIgnoreCase(busca)) {
                System.out.println("Produto encontrado!");
                estoque[i].mostrar();
                break;
            }
        }
    }
}