package exercicios.vetores.ex6;

import java.util.Scanner;

public class Ex6 {
    //Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
    //mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
    //os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int qtd = sc.nextInt();

        double[] vetor = new double[qtd];
        double somaElementos = 0, media;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            somaElementos += vetor[i];
        }
        media = somaElementos / qtd;

        System.out.printf("Media do vetor =  %.3f%n", media);
        System.out.println("Elementos abaixo da media: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media) {
                System.out.println(vetor[i]);
            }
        }


    }
}
