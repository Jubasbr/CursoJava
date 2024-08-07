package exercicios.heranca_polimorfismo.Ex1.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exercicios.heranca_polimorfismo.Ex1.entidades.Empregado;
import exercicios.heranca_polimorfismo.Ex1.entidades.EmpregadoTerceirizado;

public class Programa {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Empregado> listaDeEmpregados = new ArrayList<>();

        System.out.print("Entre com numero de funcionarios: ");
        int quantidadeDeFuncionarios = sc.nextInt();

        for(int i = 1; i<= quantidadeDeFuncionarios; i++){
            System.out.println("Dados do "+ i +"º Funcionario:");
            System.out.print("Terceizado (S/N)? ");
            char terceirizado = sc.next().charAt(0);

            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("Horas: ");
            int horas = sc.nextInt();

            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();

            if(terceirizado == 's'){
                System.out.print("Adicional: ");
                double adicional = sc.nextDouble();
                //Empregado novoEmpregado = new EmpregadoTerceirizado(nome, horas, valorPorHora, adicional);
                listaDeEmpregados.add(new EmpregadoTerceirizado(nome, horas, valorPorHora, adicional));
            }

            else{
                listaDeEmpregados.add(new Empregado(nome, horas, valorPorHora));
            }
        }
        System.out.print("Pagamentos: \n");
        for (Empregado empregado : listaDeEmpregados) {
            System.out.println(empregado.getNome()+" - $ "+empregado.pagamento());
        }
        System.out.println("");

        sc.close();
    }

}
