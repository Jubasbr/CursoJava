package exercicios.heranca_polimorfismo.Ex3_Abstrato.entities;

public abstract class Imposto {

    protected String nome;
    protected double rendimentoAnual;

    public Imposto(){
    }

    public Imposto(String nome, double rendimentoAnual) {
        this.nome = nome;
        this.rendimentoAnual = rendimentoAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendimentoAnual() {
        return rendimentoAnual;
    }

    public void setRendimentoAnual(double rendimentoAnual) {
        this.rendimentoAnual = rendimentoAnual;
    }

    public abstract Double taxas();
}
