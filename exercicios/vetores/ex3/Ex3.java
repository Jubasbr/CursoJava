package exercicios.vetores.ex3;

import java.util.Scanner;

public class Ex3 {
    //Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
    //- Imprimir todos os elementos do vetor
    //- Mostrar na tela a soma e a média dos elementos do vetor

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

        //mostra numeros do vetor e aproveita pra somar
        int soma = 0;
        System.out.print("Valores: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            soma += numeros[i];
        }

        System.out.println("\nSoma: " + soma);
        System.out.println("Media: " + (soma / qtd));

        sc.close();
    }

}
