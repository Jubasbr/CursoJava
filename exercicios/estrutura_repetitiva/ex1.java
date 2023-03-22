package exercicios.estrutura_repetitiva;

import java.util.Scanner;

//Usando Do-While
public class ex1 {
    //Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
    //incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
    //impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int senha;
        System.out.println("Digite a senha: ");
        senha = entrada.nextInt();

        while (senha!= 2002){
            System.out.println("Senha invalida");
            senha = entrada.nextInt();
        }
        System.out.println("Senha correta");
        entrada.close();
    }
}
