package tutorial;

public class Aula05OperadoresRelacionaisResto {
// OPERADOR RESTO %
    int numero1;
    double numero2;

    int numero3;
    double numero4;

    int numero5;
    double numero6;

    int numero7;
    double numero8;

    int numero9;
    double numero10;

    static double resto;
    static double resto2;
    static double resto3;
    static double resto4;
    static double resto5;

    public static void main(String[] args) {

        Aula05OperadoresRelacionaisResto AL = new Aula05OperadoresRelacionaisResto();
        AL.numero1 = 10;
        AL.numero2 = 2;
        AL.numero3 = 20;
        AL.numero4 = 3;
        AL.numero5 = 30;
        AL.numero6 = 7;
        AL.numero7 = 40;
        AL.numero8 = 26;
        AL.numero9 = 50;
        AL.numero10 = 8;
        AL.resto = AL.numero1 % AL.numero2;
        AL.resto2 = AL.numero3 % AL.numero4;
        AL.resto3 = AL.numero5 % AL.numero6;
        AL.resto4 = AL.numero7 % AL.numero8;
        AL.resto5 = AL.numero9 % AL.numero10;

        System.out.println("RESULTADO DO RESTO 10 % 2 : = " + AL.resto);
        System.out.println("RESULTADO DO RESTO 20 % 3: =" + AL.resto2);
        System.out.println("RESULTADO DO RESTO 30 % 7: =" + AL.resto3);
        System.out.println("RESULTADO DO RESTO 40 % 26: =" + AL.resto5);


    }
}
