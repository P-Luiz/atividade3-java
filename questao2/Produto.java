package questao2;

public class Produto {
    String nome;
    int codigo;
    int quantidade;
    double preco;
    String setor;

    void cadastrar(String nome, int codigo, int quantidade, double preco, String setor){
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
        this.setor = setor;
    }

    void vender(int quant){
        this.quantidade = (this.quantidade - quant);
    }

    void mostrar(){
        System.out.println("\n---DESCRIÇÃO PRODUTO---");
        System.out.printf("NOME :%s \nCÓDIGO: %d\nQUANTIDADE: %d\nPREÇO: %.2f\nSETOR: %s\n",this.nome,this.codigo,this.quantidade,this.preco,this.setor);
    }
}


//2)      Faça uma classe Produto com 5 atributos e 3 métodos. Instancie (simule) 2 objetos.