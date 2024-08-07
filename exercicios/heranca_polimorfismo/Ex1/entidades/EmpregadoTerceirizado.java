package exercicios.heranca_polimorfismo.Ex1.entidades;

public class EmpregadoTerceirizado extends Empregado{

    private double adicional;

    public EmpregadoTerceirizado(){
        super();
    }

    public EmpregadoTerceirizado(String nome, Integer horas, Double valorPorHora, double adicional) {
        super(nome, horas, valorPorHora);
        this.adicional = adicional;
    }

    @Override
    public Double pagamento() {
        return super.pagamento() + adicional * 1.1;
    }

    

}
