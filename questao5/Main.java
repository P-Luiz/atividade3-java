package questao5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        ContaCorrente cc1 = new ContaCorrente();
        ContaCorrente cc2 = new ContaCorrente();
        
        // Simulando preenchimento direto e depósitos
        System.out.println("Nome do titular 1: ");
        cc1.titular = leia.nextLine();
        System.out.println("Valor do depósito inicial: ");
        cc1.depositar(leia.nextDouble());
        
        leia.nextLine(); // Limpar buffer
        
        System.out.println("Nome do titular 2: ");
        cc2.titular = leia.nextLine();
        System.out.println("Valor do depósito inicial: ");
        cc2.depositar(leia.nextDouble());
        
        cc1.exibir();
        cc2.exibir();
    }
}

//5)      Faça uma classe ContaCorrente com 3 atributos e 2 métodos. Instancie (simule) 2 objetos.