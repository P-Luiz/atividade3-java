package questao3;

import java.util.Scanner;

public class Funcionario {
    String nome;
    String cargo;
    long cpf;
    double salario;
    int matricula;

    void cadastrar(Scanner leia) {
        leia.nextLine(); // Limpar buffer
        System.out.println("digite o nome do funcionário: ");
        this.nome = leia.nextLine();
        System.out.println("digite o cargo: ");
        this.cargo = leia.nextLine();
        System.out.println("digite o cpf: ");
        this.cpf = leia.nextLong();
        System.out.println("digite a matrícula: ");
        this.matricula = leia.nextInt();
        System.out.println("digite o salário: ");
        this.salario = leia.nextDouble();
    }

    void reajustarSalario(double valor) {
        this.salario = this.salario + valor;
    }

    void exibir() {
        System.out.println("\n--- DADOS DO FUNCIONÁRIO ---");
        System.out.println("NOME: " + this.nome);
        System.out.println("CARGO: " + this.cargo);
        System.out.println("MATRÍCULA: " + this.matricula);
        System.out.println("SALÁRIO: " + this.salario);
    }
}

//3)      Faça uma classe Funcionário com 5 atributos e 3 métodos. Instancie (simule) 2 objetos
