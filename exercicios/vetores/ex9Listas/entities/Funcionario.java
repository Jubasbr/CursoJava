package exercicios.vetores.ex9Listas.entities;

import java.util.List;

public class Funcionario {

    private int id;
    private String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentoDeSalario(double porcentagem) {
        salario += salario * porcentagem / 100;
    }

    public String toString() {
        return getId()
                + ", "
                + getNome()
                + ", "
                + String.format("%.2f", getSalario());
    }

    public static boolean idExistente(List<Funcionario> lista, int id) {
        Funcionario func = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return func != null;
    }
}
