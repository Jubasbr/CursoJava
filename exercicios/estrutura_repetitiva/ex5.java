package exercicios.estrutura_repetitiva;

import java.util.Scanner;

public class ex5 {
    //Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
    //Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
    //essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo)

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int x, dentro = 0, fora = 0;
        for (int i = 0; i<n ; i++){
            x = entrada.nextInt();
            if ((x>10)&&(x<=20)) dentro +=1;
            else {
                fora +=1;
            }
        }
        System.out.println(dentro + " in\n" + fora +" out");
        entrada.close();
    }
}
