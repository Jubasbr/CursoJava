package exercicios.heranca_polimorfismo.Ex2.entidades;

public class Produto {

    protected String nome;
    protected Double preco;

    public Produto(){
    }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(nome);
        sb.append(" $ ");
        sb.append(preco);
        return sb.toString();
    }

}
