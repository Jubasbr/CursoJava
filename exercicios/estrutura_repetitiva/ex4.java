package exercicios.estrutura_repetitiva;

import java.util.Scanner;

public class ex4 {
    //Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
    //X, se for o caso

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x = entrada.nextInt();
        for (int i = 0; i<=x ; i++){
            if ((i%2)!=0) System.out.println(i);
        }
        entrada.close();
    }
}
