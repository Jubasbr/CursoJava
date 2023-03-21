package exercicios.estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ex5 {
    //Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
    //seguir, calcule e mostre o valor da conta a pagar.
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int cod = sc.nextInt();
        int qtd = sc.nextInt();
        float preco = switch (cod) {
            case 1 -> qtd * 4;
            case 2 -> (float) (qtd * 4.5);
            case 3 -> qtd * 5;
            case 4 -> qtd * 2;
            default -> (float) (qtd * 1.5);
        };
        System.out.printf("Total: R$%.2f", preco);

        sc.close();
    }
}
