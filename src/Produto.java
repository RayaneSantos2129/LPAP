public class Produto {
    // Atributos
    int codigo;
    private String nome;
    double valor;

    // setter
    public void setNome(String valor){
        this.nome = valor;
    }

    // Construtor padrão
    Produto(){}
    // Sobrecarga do método construtor
    Produto(int _codigo){
        this.codigo = _codigo;
    }
    //mais uma sobrecraga
    Produto(int _codigo, String _nome){
        this.codigo = _codigo;
        this.nome = _nome;
    }

    public Produto(String bolinha) {
        this.nome = bolinha;
    }
}
