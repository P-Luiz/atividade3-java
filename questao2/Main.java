package questao2;

public class Main {
    public static void main(String[]args){
        int quant;
        Produto prod1 = new Produto();
        Produto prod2 = new Produto();
        prod1.cadastrar("feijao",1,40,5.80,"alimenticio");
        prod2.cadastrar("sabao",2,40,2.50,"limpeza");
        prod1.vender(20);
        prod1.mostrar();
        prod2.mostrar();
    }
}


//2)      Faça uma classe Produto com 5 atributos e 3 métodos. Instancie (simule) 2 objetos.