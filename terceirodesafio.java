import java.util.Scanner;

public class terceirodesafio {


    public static void main(String[] args){

        System.out.println("Digite o valor da soma com virgulas, se necessario");

        Scanner leitor = new Scanner(System.in);

        double valor1;
        valor1 = leitor.nextDouble();

        double valor2;
        valor2 = leitor.nextDouble();

        double valorSoma = soma(valor1, valor2);
 
        System.out.println(valorSoma);

    }


    public static double soma(double primeiroValor, double segundoValor) {
        double resultado = primeiroValor + segundoValor;
        return resultado;
    }

}

    //Desafio Extra --- Criar outros quatro programas, um para cada operação aritmética!
    //                    a partir da entrada de texto (numeros)
