package exercicios.vetores.ex7.program;

import exercicios.vetores.ex7.entities.Alunos;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    //Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
    //no 1º e 2º semestres. Depois, imprimir os nomes dos alunos aprovados, considerando aprovados aqueles cuja
    // média das notas seja maior ou igual a 6.0 (seis).

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos serao digitados? ");
        int quantidade = sc.nextInt();
        Alunos[] alunos = new Alunos[quantidade];

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Dados da " + (i + 1) + "o aluno: ");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Nota 1: ");
            double nota1 = sc.nextInt();
            System.out.print("Nota 2: ");
            double nota2 = sc.nextDouble();
            alunos[i] = new Alunos(nome, nota1, nota2);
        }

        Alunos.verificaAprovados(alunos);





        sc.close();
    }
}
