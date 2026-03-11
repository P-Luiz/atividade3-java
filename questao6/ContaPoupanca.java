package questao6;

public class ContaPoupanca {
    String titular;
    int numero;
    double saldo;

    void aplicarJuros(double taxa) {
        this.saldo = this.saldo + (this.saldo * (taxa / 100));
    }

    void exibir() {
        System.out.println("\n--- CONTA POUPANÇA ---");
        System.out.println("TITULAR: " + this.titular);
        System.out.println("SALDO COM RENDIMENTO: " + this.saldo);
    }
}

//6)      Faça uma classe ContaPoupança com 3 atributos e 2 métodos. Instancie (simule) 2 objetos.