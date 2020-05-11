import java.util.Scanner;

public class quintodesafio {


    public static void main(String[] args){

        System.out.println("Digite o valor da multiplicacao com virgulas, se necessario");

        Scanner leitor = new Scanner(System.in);

        double valor1;
        valor1 = leitor.nextDouble();

        double valor2;
        valor2 = leitor.nextDouble();

        double valorMultiplicacao = soma(valor1, valor2);
 
        System.out.println(valorMultiplicacao);

    }


    public static double soma(double primeiroValor, double segundoValor) {
        double resultado = primeiroValor * segundoValor;
        return resultado;
    }

}
