package exercicios.vetores.ex8.program;

import exercicios.vetores.ex8.entities.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
    //Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
    //que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
    //de homens.

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos pessoas serao digitados? ");
        int quantidade = sc.nextInt();
        Pessoas[] pessoas = new Pessoas[quantidade];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.print("Altura da " + (i + 1) + "a pessoa: ");
            double altura = sc.nextDouble();
            sc.nextLine();
            System.out.print("Genero da " + (i + 1) + "a pessoa: ");
            char genero = sc.nextLine().charAt(0);
            pessoas[i] = new Pessoas(altura, genero);
        }

        System.out.printf("Maior Altura = %.2f%n", Pessoas.maiorAltura(pessoas));
        System.out.printf("Menor altura = %.2f%n", Pessoas.menorAltura(pessoas));
        System.out.printf("Media das alturas das mulheres = %.2f%n", Pessoas.retornaMedia('f', pessoas));
        System.out.println("Numero de homens " + Pessoas.quantidadeGenero('m', pessoas));


        sc.close();
    }
}
