package exercicios.estrutura_repetitiva;

import java.util.Scanner;

public class ex8 {
    //Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
    //Lembrando que, por definição, fatorial de 0 é 1.

    public static void main(String[] args) {
        int n, fatorial;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        fatorial = n;
        for (int i=1; i<n; i++){
            fatorial *= i;

        }
        System.out.println(fatorial);
        sc.close();
    }
}
