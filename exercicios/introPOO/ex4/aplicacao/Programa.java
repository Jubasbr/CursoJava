package exercicios.introPOO.ex4.aplicacao;

import exercicios.introPOO.ex4.entidade.Dollar;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    //Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
    //uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
    //que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe dollar
    //para ser responsável pelos cálculos.

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o preço do Dollar? ");
        double preco = sc.nextDouble();
        System.out.print("Quantos dolares serao comprados? ");
        double qtd = sc.nextDouble();
        System.out.printf("Quantidade paga em reais: %.2f", Dollar.dollarParaReal(preco,qtd));


        sc.close();
    }
}
