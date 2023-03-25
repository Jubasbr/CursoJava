package exercicios.introPOO.ex2.entidade;

public class Funcionario {
    public String nome;
    public double salarioBruto, imposto;

    public double salarioLiquido(){
        return salarioBruto - imposto;
    }

    public void aumentoDeSalario(double porcentagem){
        salarioBruto += salarioBruto * porcentagem / 100;
    }


    public String toString(){
        return nome + ", $ " + String.format("%.2f", salarioLiquido());
    }

}
