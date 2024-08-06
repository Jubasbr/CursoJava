package exercicios.enumeracoes_composicoes.aplicacao;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exercicios.enumeracoes_composicoes.entidades.Cliente;
import exercicios.enumeracoes_composicoes.entidades.Pedido;
import exercicios.enumeracoes_composicoes.entidades.PedidoItem;
import exercicios.enumeracoes_composicoes.entidades.Produto;
import exercicios.enumeracoes_composicoes.entidades.enumeracao.StatusDeEnvio;

public class Principal {

    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat formatoDeData = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Entre com os dados do cliente");
        System.out.print("\nNome: ");
        String nome = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Data de Nascimento (dd/mm/aaaa): ");
        Date nascimento = formatoDeData.parse(sc.next());

        Cliente cliente = new Cliente(nome, email, nascimento);

        System.out.print("Entre com os dados do pedido\n");
        System.out.print("Status: ");
        StatusDeEnvio status = StatusDeEnvio.valueOf(sc.next());
        
        Pedido pedido = new Pedido(new Date(), status, cliente);
        
        System.out.print("Quantos itens nesse pedido? ");
        int qtdItens = sc.nextInt();
        for (int i = 1; i <= qtdItens; i++){
            System.out.print("Entre o item #" +i);
            System.out.print("Nome do produto: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();
            System.out.print("Preço do Prduto: ");
            Double precoProduto = sc.nextDouble();

            Produto produto = new Produto(nomeProduto, precoProduto);

            System.out.print("Quantidade: ");
            int quantidadeDoProduto = sc.nextInt();

            PedidoItem pedidoItem = new PedidoItem(quantidadeDoProduto, precoProduto, produto);
            pedido.adicionarItem(pedidoItem);
        }

        System.out.println("Resumo do Pedido:");
        System.out.println(pedido);


        sc.close();

        
    }

}
