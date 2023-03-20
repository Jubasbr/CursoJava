package exercicios.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ex6 {
    /*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
    mostre:
    a) a área do triângulo retângulo que tem A por base e C por altura.
    b) a área do círculo de raio C. (pi = 3.14159)
    c) a área do trapézio que tem A e B por bases e C por altura.
    d) a área do quadrado que tem lado B.
    e) a área do retângulo que tem lados A e B.*/
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        float a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        triangulo = a * c / 2;
        circulo = (float) 3.14159 * c * c;
        trapezio = (a + b) * c / 2;
        quadrado = b * b;
        retangulo = a * b;

        System.out.printf("Triangulo: %.3f%nCirculo: %.3f%nTrapezio: %.3f%nQuadrado: %.3f%nRetangulo: %.3f",
                triangulo, circulo, trapezio, quadrado, retangulo);
        sc.close();
    }
}
