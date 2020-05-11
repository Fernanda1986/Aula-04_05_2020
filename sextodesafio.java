import java.util.Scanner;

public class sextodesafio {


    public static void main(String[] args){

        System.out.println("Digite o valor da divisao com virgulas, se necessario");

        Scanner leitor = new Scanner(System.in);

        double valor1;
        valor1 = leitor.nextDouble();

        double valor2;
        valor2 = leitor.nextDouble();

        double valorDivisao = soma(valor1, valor2);
 
        System.out.println(valorDivisao);

    }


    public static double soma(double primeiroValor, double segundoValor) {
        double resultado = primeiroValor / segundoValor;
        return resultado;
    }

}