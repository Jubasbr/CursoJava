package exercicios.introPOO.ex4.entidade;

public class Dollar {

    public static double iof = 0.06;

    public static double dollarParaReal(double dollares, double qtd){
    return dollares * qtd * (1 + iof);
    }
}
