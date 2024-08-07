package exercicios.heranca_polimorfismo.Ex2.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    Date dataDeFabricacao;
    
    public ProdutoUsado(){
        super();
    }

    public ProdutoUsado(String nome, Double preco, Date dataDeFabricacao) {
        super(nome, preco);
        this.dataDeFabricacao = dataDeFabricacao;
    }

    public Date getDataDeFabricacao() {
        return dataDeFabricacao;
    }

    public void setDataDeFabricacao(Date dataDeFabricacao) {
        this.dataDeFabricacao = dataDeFabricacao;
    }

    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(nome + " (Usado) ");
        sb.append(" $ ");
        sb.append(preco);
        sb.append(" (Data de fabricação: " + sdf.format(dataDeFabricacao) + ")");
        return sb.toString();
    }

    

}
