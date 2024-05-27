package tutorial;

public class Aula04OperadoresAritmeticos {
    int numero1 = 2; // adição 2+4 = 6
    double numero2 = 4; // adição

    int numero3 = 10; // subtração 10-5 = 5
    double numero4 = 5; // subtração

    int numero5 = 8; //  multiplicação 8x8 = 64
    double numero6 = 8; // multiplicação

    int numero7 = 20; // divisão 20/10 = 2
    double numero8 = 10; // divisão

    static double resultadoadicao; // resultado adição
    static double resultadoadicao2; // resultado subtração
    static double resultadoadicao3; // resultado multiplicação
    static double resultadoadicao4; // resultado divisão

    public static void main(String[] args) {

        Aula04Operadores AO = new Aula04OperadoresAritmeticos();
        AO.resultadoadicao = AO.numero1 + AO.numero2; // SOMANDO
        AO.resultadoadicao2 = AO.numero3 - AO.numero4; // SUBTRAINDO
        AO.resultadoadicao3 = AO.numero5 * AO.numero6; // MULTIPLICANDO
        AO.resultadoadicao4 = AO.numero7 / AO.numero8; // DIVINDO

        System.out.println(" RESULTADO ADIÇÃO: = " + resultadoadicao); // LENDO O RESULTADO DA ADIÇÃO
        System.out.println("RESULTADO SUBTRAÇÃO: = " + resultadoadicao2); // LENDO O RESULTADO DA SUBTRAÇÃO
        System.out.println("RESULTADO MULTIPLICAÇÃO: = " + resultadoadicao3); // LENDO O RESULTADO DA MULTIPLICAÇÃO
        System.out.println("RESULTADO DIVISÃO: = " + resultadoadicao4); // LENDO RESULTADO DA DIVISÃO


    }
}

// OBSERVAÇÃO: QUANDO É ADICIONADO INTEIROS COM INTEIRO, O RESULTADO SERÁ INTEIRO.
// EXEMPLO: INT + INT = INT
// INT + DOUBLE = DOUBLE
