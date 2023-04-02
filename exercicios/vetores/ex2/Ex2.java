package exercicios.vetores.ex2;

import java.util.Scanner;

public class Ex2 {

    //Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
    //e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int qtd = sc.nextInt();
        int[] numeros = new int[qtd];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Numeros negativos:");
        for (int numero : numeros) {
            if (numero < 0) {
                System.out.println(numero);
            }

        }

        sc.close();
    }
}
