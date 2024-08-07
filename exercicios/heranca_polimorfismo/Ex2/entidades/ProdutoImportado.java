package exercicios.heranca_polimorfismo.Ex2.entidades;

public class ProdutoImportado extends Produto{

    private Double custosImportacao;

    public ProdutoImportado(){
        super();
    }

    public ProdutoImportado(String nome, Double preco, Double custosImportacao) {
        super(nome, preco);
        this.custosImportacao = custosImportacao;
    }

    public Double getCustosImportacao() {
        return custosImportacao;
    }

    public void setCustosImportacao(Double custosImportacao) {
        this.custosImportacao = custosImportacao;
    }

    public double preçoTotal(){
        return preco + custosImportacao;
    }

    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(nome);
        sb.append(" $ ");
        sb.append(preçoTotal());
        sb.append(" (Custos de importação: " + custosImportacao + ")");
        return sb.toString();
    }
    

}
