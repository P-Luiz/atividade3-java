package questao9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Autores autor1 = new Autores();
        Autores autor2 = new Autores();
        autor1.cadastrar("Graciliano Ramos", 1, 10);
        autor2.cadastrar("Antoine de Saint-Exupéry", 2, 5);
        autor1.exibir();
        autor2.exibir();

        System.out.println("\n-------------------------------------------");
        Livros livro1 = new Livros();
        Livros livro2 = new Livros();
        livro1.cadastrar("Vidas Secas", 1938, "Graciliano Ramos", 176);
        livro2.cadastrar("O Pequeno Príncipe", 1943, "Saint-Exupéry", 96);
        System.out.println("LIVROS CADASTRADOS:");
        livro1.exibir();
        livro2.exibir();
        System.out.println("\n--- TESTANDO EDIÇÃO ---");
        livro1.atualizar(); 
        System.out.println("\n--- RELATÓRIO ATUALIZADO ---");
        livro1.exibir();
        livro2.exibir();
    }
}