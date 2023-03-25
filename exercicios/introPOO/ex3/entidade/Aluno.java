package exercicios.introPOO.ex3.entidade;

public class Aluno {

    public double nota1, nota2, nota3;
    public String nome;

    public double nota(){
        return (nota1 + nota2 + nota3);
    }

    public  double pontosFaltantes(){
        return 60 - nota();
    }
}
