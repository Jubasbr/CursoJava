package exercicios.vetores.ex4;

import java.util.Scanner;

public class Ex4 {
//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int qtd = sc.nextInt();
        int[] numeros = new int[qtd];

        //coleta dados
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        //mostra numeros pares do vetor e aproveita pra somar
        int soma = 0;
        System.out.print("Numeros pares: ");
        for (int numero : numeros) {
            if (numero % 2 != 1) {
                System.out.print(numero + " ");
                soma++;
            }
        }
        System.out.println("\nQuantidade de pares = " + soma);
    }
}
