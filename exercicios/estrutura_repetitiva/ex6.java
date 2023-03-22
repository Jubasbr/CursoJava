package exercicios.estrutura_repetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        double x1, x2, x3, media;
        for (int i = 0; i<n ; i++){
            x1 = entrada.nextDouble();
            x2 = entrada.nextDouble();
            x3 = entrada.nextDouble();
            media = (x1*2 + x2*3 + x3*5)/10;
            System.out.println(media);
        }

        entrada.close();
    }
}
