package exercicios.estrutura_repetitiva;

import java.util.Scanner;

public class ex9 {
    //Ler um número inteiro N e calcular todos os seus divisores.

    public static void main(String[] args) {
        int n,res;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            res = n % i;
            if (res == 0) System.out.println(i);
        }
        sc.close();
    }
}
