package exercicios.vetores.ex7.entities;

public class Alunos {
    private String nome;
    private double nota1, nota2;

    public Alunos(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public static void verificaAprovados(Alunos[] estudante) {
        System.out.println("Alunos aprovados: ");
        for (Alunos alunos : estudante) {
            if ((alunos.getNota1() + alunos.getNota2() / 2) >= 6){
                System.out.println(alunos.getNome());
            }
        }
    }
}
