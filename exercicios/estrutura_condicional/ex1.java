package exercicios.estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ex1 {
    //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a<0) System.out.println("Negativo");
        else System.out.println("Não negativo");
        sc.close();
    }
}
