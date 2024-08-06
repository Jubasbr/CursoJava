package exercicios.enumeracoes_composicoes.entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import exercicios.enumeracoes_composicoes.entidades.enumeracao.StatusDeEnvio;

public class Pedido {


    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date momento;
    
    private StatusDeEnvio statusDeEnvio;
    private Cliente cliente;
    private List<PedidoItem> itens = new ArrayList<>();
    
    public Pedido(Date momento, StatusDeEnvio statusDeEnvio, Cliente cliente) {
        this.momento = momento;
        this.statusDeEnvio = statusDeEnvio;
        this.cliente = cliente;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusDeEnvio getStatusDeEnvio() {
        return statusDeEnvio;
    }

    public void setStatusDeEnvio(StatusDeEnvio statusDeEnvio) {
        this.statusDeEnvio = statusDeEnvio;
    }

    public List<PedidoItem> getItens() {
        return itens;
    }

    public void adicionarItem(PedidoItem item){
        itens.add(item);
    }

    public void removerItem(PedidoItem item){
        itens.remove(item);
    }
    
    public double total(){
        double soma=0;
        for(PedidoItem c : itens){
            soma += c.subTotal();
        }
        return soma;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Momento do Pedido: ");
        sb.append(sdf.format(momento) +"\n");
        sb.append("Status do Pedido: ");
        sb.append(statusDeEnvio + "\n");
        sb.append("Cliente: ");
        sb.append(cliente +"\n");
        sb.append("Lista dos pedidos: \n");
        for (PedidoItem linhaItem : itens) {
            sb.append(linhaItem + "\n");            
        }
        sb.append("Valor total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
    }

    

}
