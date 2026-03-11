package questao3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();

        f1.cadastrar(leia);
        f2.cadastrar(leia);
        f1.exibir();
        f2.exibir();
    }
}

//3)      Faça uma classe Funcionário com 5 atributos e 3 métodos. Instancie (simule) 2 objetos