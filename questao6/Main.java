package questao6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        ContaPoupanca cp1 = new ContaPoupanca();
        ContaPoupanca cp2 = new ContaPoupanca();
        
        cp1.titular = "Pedro";
        cp1.saldo = 1000.00;
        
        cp2.titular = "Vitor";
        cp2.saldo = 2000.00;
        
        System.out.println("Digite a taxa de juros para aplicar (ex: 5 para 5%): ");
        double taxa = leia.nextDouble();
        
        cp1.aplicarJuros(taxa);
        cp2.aplicarJuros(taxa);
        
        cp1.exibir();
        cp2.exibir();
    }
}

//6)      Faça uma classe ContaPoupança com 3 atributos e 2 métodos. Instancie (simule) 2 objetos.