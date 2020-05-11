import java.util.Scanner;

public class quartodesafio {


    public static void main(String[] args){

        System.out.println("Digite o valor da subtracao com virgulas, se necessario");

        Scanner leitor = new Scanner(System.in);

        double valor1;
        valor1 = leitor.nextDouble();

        double valor2;
        valor2 = leitor.nextDouble();

        double valorSubtracao = soma(valor1, valor2);
 
        System.out.println(valorSubtracao);

    }


    public static double soma(double primeiroValor, double segundoValor) {
        double resultado = primeiroValor - segundoValor;
        return resultado;
    }

}
