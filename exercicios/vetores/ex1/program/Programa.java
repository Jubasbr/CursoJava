package exercicios.vetores.ex1.program;

import exercicios.vetores.ex1.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    //Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
    //tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
    //bem como os nomes dessas pessoas caso houver.

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas?");
        int qtd = sc.nextInt();
        Pessoa[] individuos = new Pessoa[qtd];

        //Coleta de dados
        for (int i = 0; i < individuos.length; i++) {
            System.out.println("Dados da " + (i + 1) + "a pessoa: ");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            individuos[i] = new Pessoa(nome, idade, altura);
        }

        System.out.printf("Altura média: %.2f%n", Pessoa.mediaAltura(individuos));
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", Pessoa.porcentagemMenorDe16(individuos));
        for (Pessoa ind : individuos) {
            if (ind.getIdade() < 16) {
                System.out.println(ind.getNome());
            }
        }


    }
}

