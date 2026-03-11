package questao9;

import java.util.Scanner;

public class Livros {
    String titulo;
    int ano;
    String autor;
    int npaginas;

    void cadastrar(String titulo, int ano, String autor, int npaginas){
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
        this.npaginas = npaginas;
    }

    void exibir(){
        System.out.println("\n--- especificações livro ---");
        System.out.printf("TITULO: %s\nANO: %d\nAUTOR: %s\n NÚMERO DE PÁGINAS: %d\n",this.titulo,this.ano,this.autor,this.npaginas);
    }

    void atualizar(){
        int escolha, num;
        String nome;
        Scanner leia = new Scanner(System.in);
        System.out.println("QUAL DADO DO LIVRO " + this.titulo + " VOCE QUER EDITAR?");
        System.out.println("1 - TITULO\n 2 - ANO \n 3 - AUTOR \n 4 - NÚMERO DE PÁGINAS\n");
        escolha = leia.nextInt();
        leia.nextLine();
        switch(escolha){
            case 1:
                System.out.println("digite o novo titulo do livro: ");
                nome = leia.nextLine();
                this.titulo = nome;
                break;
            case 2:
                System.out.println("digite o novo ano do livro: ");
                num = leia.nextInt();
                leia.nextLine();
                this.ano = num;
                break;
            case 3:
                System.out.println("digite o novo nome do autor: ");
                nome = leia.nextLine();
                this.autor = nome;
                break;
            case 4:
                System.out.println("digite o novo número de paginas: ");
                num = leia.nextInt();
                leia.nextLine();
                this.npaginas = num;
                break;
            default:
                System.out.println("escolha uma opção válida");
                break;
        }
    }
}
