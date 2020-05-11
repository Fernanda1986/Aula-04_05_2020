

public class segundodesafio {

 

    public static void main(String[] args){

 

        int valA = 12;
        int valB = 10;

 

        int valC = soma(valA, valB);
        int valD = subtracao(valA, valB);
        int valE = multiplicacao(valA, valB);
        float valF = divisao(valA, valB);

 
        System.out.println(valC);
        System.out.println(valD);
        System.out.println(valE);
        System.out.println(valF);
    }

 

    public static int soma(int primeiroValor, int segundoValor) {
        int resultado = primeiroValor + segundoValor;
        return resultado;
    }

 

    public static int subtracao(int primeiroValor, int segundoValor) {
        int resultado = primeiroValor - segundoValor;
        return resultado;
    }


    public static int multiplicacao(int primeiroValor, int segundoValor) {
        int resultado = primeiroValor * segundoValor;
        return resultado;
    }

    public static float divisao(float primeiroValor, float segundoValor) {
        float resultado = primeiroValor + segundoValor;
        return resultado;
    }
 

    //Desafio Extra --- Multiplicação e Divisão

 

    //Desafio Extra --- Criar outros quatro programas, um para cada operação aritmética!
    //                    a partir da entrada de texto (numeros)

 


}