package exercicios.estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ex2 {
    //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ((a%2)==0) System.out.println("Par");
        else System.out.println("Impar");
        sc.close();
    }
}
