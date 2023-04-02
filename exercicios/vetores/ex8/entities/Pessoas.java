package exercicios.vetores.ex8.entities;

public class Pessoas {
    private double altura;
    private char genero;

    public Pessoas(double altura, char genero) {
        this.altura = altura;
        this.genero = genero;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public static double retornaMedia(char genero, Pessoas[] pessoas) {
        double soma = 0;
        int count = 0;
        for (Pessoas pessoa : pessoas)
            if (pessoa.getGenero() == genero) {
                count++;
                soma += pessoa.getAltura();
            }
        return soma / count;
    }

    public static int quantidadeGenero(char genero, Pessoas[] pessoas) {
        int count = 0;
        for (Pessoas pessoa : pessoas)
            if (pessoa.getGenero() == genero) {
                count++;
            }
        return count;
    }

    public static double maiorAltura(Pessoas[] pessoas) {
        double maiorAltura = 0;
        for (Pessoas pessoa : pessoas)
            if (pessoa.getAltura() > maiorAltura) {
                maiorAltura = pessoa.getAltura();
            }
        return maiorAltura;
    }

    public static double menorAltura(Pessoas[] pessoas) {
        double menorAltura = 0;
        for (Pessoas pessoa : pessoas)
            if ((pessoa.getAltura() < menorAltura) || (menorAltura == 0)) {
                menorAltura = pessoa.getAltura();
            }
        return menorAltura;
    }
}
