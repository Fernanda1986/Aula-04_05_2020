

public class segundoprograma {

 

    public static void main(String[] args){

 

        int valA = 12;
        int valB = 10;

 

        int valC = soma(valA, valB);
        int valD = subtracao(valA, valB);

 


        System.out.println(valC);
        System.out.println(valD);
    }

 

    public static int soma(int primeiroValor, int segundoValor) {
        int resultado = primeiroValor + segundoValor;
        return resultado;
    }

 

    public static int subtracao(int primeiroValor, int segundoValor) {
        int resultado = primeiroValor - segundoValor;
        return resultado;
    }

 

    //Desafio Extra --- Multiplicação e Divisão

 

    //Desafio Extra --- Criar outros quatro programas, um para cada operação aritmética!
    //                    a partir da entrada de texto (numeros)

 


}