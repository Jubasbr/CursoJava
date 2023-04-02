package exercicios.vetores.ex5;

import java.util.Scanner;

public class Ex5 {
    //Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
    //o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
    //considerando a primeira posição como 0 (zero).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int qtd = sc.nextInt();
        double[] numeros = new double[qtd];

        //coleta dados
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }
        int posicao = 0;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > numeros[i - 1]) {
               posicao = i;
            }
        }
        System.out.println("Maior valor = " + numeros[posicao]);
        System.out.println("Posicao do maior valor = " + posicao);
        sc.close();
    }
}
