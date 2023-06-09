package exercicios.vetores.ex9Listas.program;

import exercicios.vetores.ex9Listas.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static exercicios.vetores.ex9Listas.entities.Funcionario.idExistente;

public class Programa {
    //Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
    //N funcionários. Não deve haver repetição de id.
    //Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
    //Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
    //mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
    //conforme exemplos.
    //Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
    //ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
    //aumento por porcentagem dada

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        List<Funcionario> listaDeFunc = new ArrayList<>();

        //Coleta de dados e instanciação da lista
        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Employee #" + i);
            System.out.print("ID: ");
            int id = sc.nextInt();
            while (idExistente(listaDeFunc, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salary: ");
            double salario = sc.nextDouble();
            listaDeFunc.add(new Funcionario(id, nome, salario));
        }

        //aumento de salario
        System.out.print("Enter the employee id that will have salary increase : ");
        int id = sc.nextInt();
        Funcionario  emp = listaDeFunc.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double porcentagemDeAumento = sc.nextDouble();
            emp.aumentoDeSalario(porcentagemDeAumento);
        }

        //apresentação dos resultados
        System.out.println();
        System.out.println("List of employees: ");
        for (Funcionario listaDeFuncionarios : listaDeFunc) {
            System.out.println(listaDeFuncionarios.toString());
        }


        sc.close();
    }
}
