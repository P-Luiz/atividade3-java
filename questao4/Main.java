package questao4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        // Instanciando 2 objetos
        Estudante e1 = new Estudante();
        Estudante e2 = new Estudante();
        
        // Chamada dos métodos seguindo seu estilo
        e1.cadastrar(leia);
        e2.cadastrar(leia);
        
        e1.calcularMedia();
        e2.calcularMedia();
        
        e1.exibir();
        e2.exibir();
    }
}

//4)      Faça uma classe Estudante com 5 atributos e 3 métodos. Instancie (simule) 2 objetos.