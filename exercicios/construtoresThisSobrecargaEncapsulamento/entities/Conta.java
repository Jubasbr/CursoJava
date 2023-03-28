package exercicios.construtoresThisSobrecargaEncapsulamento.entities;

public class Conta {
    private int numeroConta;
    private String nome;
    private double totalEmConta;

    public Conta(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }
    public Conta(int numeroConta, String nome, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        deposito(depositoInicial);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTotalEmConta() {
        return totalEmConta;
    }

    public void deposito(double totalEmConta) {
        this.totalEmConta += totalEmConta;
    }

    public void retirada(double retirada) {
        this.totalEmConta -= retirada + 5;
    }

    public String toString(){
        return "Account "
                + getNumeroConta()
                + ", Holder: "
                + getNome()
                + ", Balance: $"
                + String.format("%.2f", getTotalEmConta());
    }
}
