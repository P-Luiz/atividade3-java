package questao1;

import java.util.Scanner;

public class Cliente{
    String nome;
    long telefone;
    long cpf;
    char sexo;
    float comprou;

    void cadastrar(Scanner leia){
        leia.nextLine();
        System.out.println("digite o nome do cliente: ");
        this.nome = leia.nextLine();
        System.out.println("digite o telefone do cliente: ");
        this.telefone = leia.nextLong();
        System.out.println("digite o cpf do cliente");
        this.cpf = leia.nextLong();
        System.out.println("digite o sexo do cliente \n M - masculino \n F - feminino");
        this.sexo = leia.next().charAt(0); 
    }

    void vender(Scanner leia){
        System.out.printf("digite o valor da compra de %s: \n",this.nome);
        this.comprou = (this.comprou + leia.nextFloat());
    }

    void exibir(){
        System.out.println("\n----- DADOS DO CLIENTE -----");
        System.out.println("NOME: "+this.nome);
        System.out.println("TELEFONE: "+this.telefone);
        System.out.println("CPF: "+this.cpf);
        System.out.println("SEXO: "+this.sexo);
        System.out.println("COMPROU: "+this.comprou);
    }
}