package questao1;

import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        cliente1.cadastrar(leia);
        cliente2.cadastrar(leia);
        cliente1.vender(leia);
        cliente2.vender(leia);
        cliente1.exibir();
        cliente2.exibir();
    }
}

// 1)      Faça uma classe Cliente com 5 atributos e 3 métodos. Instancie (simule) 2 objetos. 