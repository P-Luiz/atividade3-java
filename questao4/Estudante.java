package questao4;

import java.util.Scanner;

public class Estudante {
    String nome;
    int ra;
    String curso;
    float nota1;
    float nota2;

    void cadastrar(Scanner leia) {
        leia.nextLine();
        System.out.println("digite o nome do estudante: ");
        this.nome = leia.nextLine();
        System.out.println("digite o curso: ");
        this.curso = leia.nextLine();
        System.out.println("digite o RA: ");
        this.ra = leia.nextInt();
        System.out.println("digite a nota 1: ");
        this.nota1 = leia.nextFloat();
        System.out.println("digite a nota 2: ");
        this.nota2 = leia.nextFloat();
    }

    void calcularMedia() {
        float media = (this.nota1 + this.nota2) / 2;
        System.out.println("Média de " + this.nome + ": " + media);
    }

    void exibir() {
        System.out.println("\n--- DADOS DO ESTUDANTE ---");
        System.out.printf("NOME: %s \nCURSO: %s \nRA: %d\n", this.nome, this.curso, this.ra);
    }
}

//4)      Faça uma classe Estudante com 5 atributos e 3 métodos. Instancie (simule) 2 objetos.