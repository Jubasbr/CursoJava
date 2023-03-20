package exercicios.estrutura_sequencial;

import java.util.Scanner;

public class ex3 {
    /*Fazer um programa para ler quatro valores inteiros A, B, C e D.
     A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo
     a fórmula: DIFERENCA = (A * B - C * D).*/
    public static void main(String[] args) {
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        System.out.println("Diferença = " + (a*b-c*d));
        sc.close();
    }
}
