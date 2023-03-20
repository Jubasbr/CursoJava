package exercicios.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {
    /*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
    código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
    Calcule e mostre o valor a ser pago.*/

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int cod1 , qtd1, cod2 , qtd2;
        float valor1, valor2, total;
        Scanner sc = new Scanner(System.in);
        cod1 = sc.nextInt();
        qtd1 = sc.nextInt();
        valor1 = sc.nextFloat();

        cod2 = sc.nextInt();
        qtd2 = sc.nextInt();
        valor2 = sc.nextFloat();

        total = valor1 * qtd1 + valor2 * qtd2;
        System.out.printf("Valor a pagar: R$%.2f", total);
        sc.close();
    }
}
