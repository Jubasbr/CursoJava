package exercicios.estrutura_repetitiva;

import java.util.Scanner;

public class ex7 {
    //Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
    //segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

    public static void main(String[] args) {
        int n, i;
        float div, n1, n2;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i=0; i<n; i++){
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            if (n2==0) System.out.println("Divisao impossivel");
            else{
                div = n1/n2;
                System.out.println(div);
            }

        }
        sc.close();
    }
}
