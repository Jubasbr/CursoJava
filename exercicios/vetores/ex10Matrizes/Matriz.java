package exercicios.vetores.ex10Matrizes;

import java.util.Scanner;

public class Matriz {

    //Fazer um programa para ler dois números inteiros M e N, e depois ler
    //uma matriz de M linhas por N colunas contendo números inteiros,
    //podendo haver repetições. Em seguida, ler um número inteiro X que
    //pertence à matriz. Para cada ocorrência de X, mostrar os valores à
    //esquerda, acima, à direita e abaixo de X, quando houver, conforme
    //exemplo.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas linhas a matriz terá?: ");
        int m = sc.nextInt();
        System.out.print("Quantas colunas a matriz terá?: ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        //coleta de dados
        for (int linha = 0; linha < m; linha++) {
            for (int coluna = 0; coluna < n; coluna++) {
                matriz[linha][coluna] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.print("Qual elemento deseja buscar a posicao?: ");
        int numero = sc.nextInt();

        //busca do valor
        for (int linha = 0; linha < m; linha++) {
            for (int coluna = 0; coluna < n; coluna++) {
                if (matriz[linha][coluna] == numero) {
                    System.out.println("Valor encontrado na posição (" + linha + "," + coluna + ")");
                    if (coluna - 1 > -1) {
                        System.out.println("A Esquerda existe o valor: " + matriz[linha][coluna - 1]);
                    }
                    if (coluna + 1 < n) {
                        System.out.println("A Direita existe o valor: " + matriz[linha][coluna + 1]);
                    }
                    if (linha - 1 > -1) {
                        System.out.println("Acima existe o valor: " + matriz[linha - 1][coluna]);
                    }
                    if (linha + 1 < m) {
                        System.out.println("Abaixo existe o valor: " + matriz[linha + 1][coluna]);
                    }
                }
            }
        }

        sc.close();
    }
}
