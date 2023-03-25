package exercicios.introPOO.ex1.entidade;

public class Retangulo {

    public double altura, largura;

    public double area(){
        return altura * largura;
    }

    public double perimetro(){
        return altura * 2 + largura * 2;
    }

    public double diagonal(){
        return Math.sqrt((altura*altura) + (largura*largura));
    }


}
