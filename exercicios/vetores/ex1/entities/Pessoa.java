package exercicios.vetores.ex1.entities;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /* teste com listas
    public static double mediaAltura(List<Pessoa> listaDeIndividuos){
        double soma = 0;
        for (Pessoa individuo : listaDeIndividuos){
            soma += individuo.getAltura();
        }
        return soma/listaDeIndividuos.size();
    }*/
    public static double mediaAltura(Pessoa[] listaDeIndividuos) {
        double soma = 0;
        for (Pessoa individuo : listaDeIndividuos) {
            soma += individuo.getAltura();
        }
        return soma / listaDeIndividuos.length;
    }

    public static double porcentagemMenorDe16(Pessoa[] listaDeIndividuos) {
        double soma = 0;
        for (Pessoa individuo : listaDeIndividuos) {
            if (individuo.getIdade() < 16) {
                soma += 1;
            }
        }
        return soma / listaDeIndividuos.length * 100;
    }
}

