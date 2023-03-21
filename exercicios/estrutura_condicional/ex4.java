package exercicios.estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class ex4 {
    /*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo
    que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e
    máxima de 24 horas*/

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int horainicial = sc.nextInt();
        int horafinal = sc.nextInt();
        int duracao;
        if (horainicial>horafinal){
            duracao = horafinal - horainicial;
        }
        else{
           duracao = 24 - horainicial + horafinal;
        }
        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        sc.close();
    }
}
