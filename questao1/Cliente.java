package questao1;

import java.util.Scanner;

public class Cliente{
    String nome;
    int telefone;
    int cpf;
    char sexo;
    float comprou;

    void cadastrar(Scanner leia){
        System.out.println("digite o nome do cliente: ");
        this.nome = leia.nextLine();
        System.out.println("digite o telefone do cliente: ");
        this.telefone = leia.nextInt();
        System.out.println("digite o cpf do cliente");
        this.cpf = leia.nextInt();
    }

    void excluir(){

    }

    void modificar(){

    }

}