package exercicios.introPOO.ex1.aplicacao;

// Fazer um programa para ler os valores da largura e altura de um retangulo. Em seguida, mostrar na tela o valor de sua
//area , perimetro e diagonal. Usar uma clase mostrado como no projeto ao lado.

import exercicios.introPOO.ex1.entidade.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Retangulo ret = new Retangulo();

        System.out.println("Entre com a altura e largura do retangulo");

        ret.altura = sc.nextDouble();
        ret.largura = sc.nextDouble();

        System.out.printf("Area : %.2f", ret.area());
        System.out.printf("\nPerimetro : %.2f", ret.perimetro());
        System.out.printf("\nDiagonal : %.2f", ret.diagonal());


        sc.close();
    }



}
