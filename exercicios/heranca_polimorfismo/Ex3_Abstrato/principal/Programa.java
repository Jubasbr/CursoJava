package exercicios.heranca_polimorfismo.Ex3_Abstrato.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercicios.heranca_polimorfismo.Ex3_Abstrato.entities.Empresas;
import exercicios.heranca_polimorfismo.Ex3_Abstrato.entities.Imposto;
import exercicios.heranca_polimorfismo.Ex3_Abstrato.entities.Individual;

public class Programa {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Imposto> listinha = new ArrayList<>();

        System.out.print("Entre com o numero de pagadores de Impostos? ");
        int qtd = sc.nextInt();

        for(int i = 1; i<= qtd; i++){
            System.out.print("PAGADOR #"+i);
            System.out.print("\nIndividual ou Corporativo?(I/C)");
           
            char ic = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Rendimento Anual: ");
            double rendimentoAnual = sc.nextDouble();

            if (ic == 'i') {
                System.out.print("Gastos com saúde: ");
                Double gastosSaude = sc.nextDouble();

                listinha.add(new Individual(nome, rendimentoAnual, gastosSaude));
            }
            else{
                System.out.print("Número de Funcionários: ");
                int numeroDeFuncionarios = sc.nextInt();

                listinha.add(new Empresas(nome, rendimentoAnual, numeroDeFuncionarios));
            }

        }
        
        System.out.print("\n\nIMPOSTOS PAGOS:");
        double totalDeTaxas = 0;
        for (Imposto imposto : listinha){
            System.out.println(imposto.getNome()+ ": $"+imposto.taxas());
            totalDeTaxas += imposto.taxas();
        }

        System.out.println("\nTotal de Taxas: $ "+ totalDeTaxas);

        sc.close();
    }

}
