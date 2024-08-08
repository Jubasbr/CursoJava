package exercicios.heranca_polimorfismo.Ex3_Abstrato.entities;

public class Empresas extends Imposto {

    private Integer numeroDeFuncionarios;

    public Empresas(){
        super();
    }
   
    public Empresas(String nome, double rendimentoAnual, Integer numeroDeFuncionarios) {
        super(nome, rendimentoAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public Integer getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public Double taxas() {
        double taxas=0;
        if( numeroDeFuncionarios > 10) taxas = rendimentoAnual * 14/100;
        else taxas = rendimentoAnual * 16/100;
        return taxas;
    }

}
