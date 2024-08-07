package exercicios.heranca_polimorfismo.Ex2.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import exercicios.heranca_polimorfismo.Ex2.entidades.Produto;
import exercicios.heranca_polimorfismo.Ex2.entidades.ProdutoImportado;
import exercicios.heranca_polimorfismo.Ex2.entidades.ProdutoUsado;

public class Programa {
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        List<Produto> lista = new ArrayList<>();

        System.out.print("Entre com o número de produtos: ");
        int qtd = sc.nextInt();
        

        for (int i = 1; i <= qtd; i++){
            System.out.print("Produto #"+i);
            System.out.print("\nComum, Usado ou Importado? (c/u/i): ");
            char usi = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            
            if(usi == 'i'){
                System.out.print("Custos de importação: ");
                double custosImportacao = sc.nextDouble();
                lista.add(new ProdutoImportado(nome, preco, custosImportacao));
            }
            else if(usi == 'u'){
                System.out.print("Data de fabricação(dd/mm/aaaa): ");
                Date dataDeFabricacao = sdf.parse(sc.next());
                System.out.println(dataDeFabricacao);
                lista.add(new ProdutoUsado(nome, preco, dataDeFabricacao));
            }
            else if(usi=='c'){
                lista.add(new Produto(nome, preco));
            }

        }

        System.out.print("PRICE TAGS:\n");
        
        for(Produto item : lista){
            System.out.println(item.priceTag());
        }


        sc.close();
    }
}



    
