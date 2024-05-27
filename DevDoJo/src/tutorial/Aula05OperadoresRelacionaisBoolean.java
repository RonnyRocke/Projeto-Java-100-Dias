package tutorial;

public class Aula05OperadoresRelacionaisBoolean {
    //OPERADORES BOOLEANOS < > <= >= == !=
    boolean is20MaiorQue40 = 20 >= 40; // falso 20 não é maior e nem igual a 40
    boolean is76MenorQue110 = 76 < 110; // true, 76 é menor que 110
    boolean is50EIgual50 = 50 == 50; // true, 50 é igual à 50
    boolean is100EDiferenteDe100 = 100 != 100; //  false, 100 é diferente de 100?

    public static void main(String[] args) {

        Aula05OperadoresRelacionaisBoolean AB = new Aula05OperadoresRelacionaisBoolean();
        System.out.println("20 É MAIOR OU IGUAL 40 ? " + AB.is20MaiorQue40); // false
        System.out.println("76 É MENOR QUE 110 ? " + AB.is76MenorQue110); // true
        System.out.println("50 É IGUAL À 50 ? " + AB.is50EIgual50); // True
        System.out.println("100 É DIFERENTE DE 100? " + AB.is100EDiferenteDe100 ); // false
    }
}
