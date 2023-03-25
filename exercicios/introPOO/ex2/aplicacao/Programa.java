package exercicios.introPOO.ex2.aplicacao;

import exercicios.introPOO.ex2.entidade.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario emp = new Funcionario();
        System.out.print("Name: ");
        emp.nome = sc.nextLine();
        System.out.print("Gross salary: ");
        emp.salarioBruto = sc.nextDouble();
        System.out.print("Tax: ");
        emp.imposto = sc.nextDouble();
        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        emp.aumentoDeSalario(percentage);
        System.out.println();
        System.out.println("Updated data: " + emp);
        sc.close();
    }
}
