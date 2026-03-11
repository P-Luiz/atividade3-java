package questao9;

public class Autores {
    String nome;
    int codigo;
    int quantLivros;

    void cadastrar(String nome, int cod, int quantl){
        this.nome = nome;
        this.codigo = cod;
        this.quantLivros = quantl;
    }

    void adicionarlivros(int quant){
        this.quantLivros = (this.quantLivros + quant);
    }

    void exibir(){
        System.out.println("\n--- DADOS AUTOR ---");
        System.out.printf("NOME: %s \n CODIGO: %d\n QUANTIDADE DE LIVROS: %d\n",this.nome,this.codigo,this.quantLivros);
    }
}

