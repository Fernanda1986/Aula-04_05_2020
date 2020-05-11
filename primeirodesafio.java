import java.util.Scanner;

public class primeirodesafio {

    public static void main(String[] args) {
	
	System.out.println("Digite o valor do imposto de renda com virgulas");

	Scanner leitor1 = new Scanner(System.in);

	double valorImposto;
        valorImposto = leitor1.nextDouble();

	System.out.println("O valor do imposto e: " + valorImposto);
	
	System.out.println("Digite o valor do salario com virgulas");

	Scanner leitor2 = new Scanner(System.in);

        double valorSalario;
        valorSalario = leitor2.nextDouble();

	System.out.println("O salario e: " + valorSalario);

	System.out.println("O valor de imposto a ser pago e: " + ((valorImposto * valorSalario)/100));	

	}

}