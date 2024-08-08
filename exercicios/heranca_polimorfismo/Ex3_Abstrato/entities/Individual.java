package exercicios.heranca_polimorfismo.Ex3_Abstrato.entities;

public class Individual extends Imposto{

    private double gastosSaude;

    public Individual(){
        super();
    }

    public Individual(String nome, double rendimentoAnual, double gastosSaude) {
        super(nome, rendimentoAnual);
        this.gastosSaude = gastosSaude;
    }

    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double taxas() {
        double taxas=0;
        if( rendimentoAnual <= 20000){
            taxas = (rendimentoAnual *15/100)-(gastosSaude*50/100);
        }
        else{
            taxas = (rendimentoAnual *25/100)-(gastosSaude*50/100);
        }
        return taxas;
    }

    

}
