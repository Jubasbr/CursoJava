package exercicios.introPOO.ex3.aplicacao;

import exercicios.introPOO.ex3.entidade.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    //fazer um programa para ler o nome de um aluno e as tres notas que ele obteve nos tres trimestes do ano
    //(primeiro trimestre vale 30 e os outros dois 35 cada). Ao final, mostrar qual a nota final do aluno no ano.
    //Dizer também se o alino está aprovado ou nao e, em caso negativo, quantos pontos faltam para o alunno obter o minimo
    //para ser aprovado (60%). Criar classe aluno para esse problema

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        aluno.nome = sc.nextLine();
        aluno.nota1 = sc.nextDouble();
        aluno.nota2 = sc.nextDouble();
        aluno.nota3 = sc.nextDouble();

        System.out.printf("nota Final = %.2f", aluno.nota());

        if (aluno.nota()>=60){
            System.out.println("\nAprovado");
        } else{
            System.out.println("\nReprovado");
            System.out.printf("Faltou %.2f pontos", aluno.pontosFaltantes());
        }

        sc.close();
    }
}
