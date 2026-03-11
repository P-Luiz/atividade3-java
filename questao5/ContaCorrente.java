package questao5;

public class ContaCorrente {
    String titular;
    int numero;
    double saldo;

    void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    void exibir() {
        System.out.println("\n--- CONTA CORRENTE ---");
        System.out.println("TITULAR: " + this.titular);
        System.out.println("NÚMERO: " + this.numero);
        System.out.println("SALDO: " + this.saldo);
    }
}

//5)      Faça uma classe ContaCorrente com 3 atributos e 2 métodos. Instancie (simule) 2 objetos.