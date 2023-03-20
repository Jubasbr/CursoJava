package exercicios.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {
    /*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que
    recebe por hora e calcula o salário desse funcionário.
    A seguir, mostre o número e o salário do funcionário, com duas casas decimais.*/

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        float valor = sc.nextFloat();
        float horas = sc.nextFloat();
        float salario = valor*horas;
        System.out.printf("Number = %d %nSalary = U$ %.2f", id, salario);
        sc.close();
    }
}
