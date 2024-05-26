package tutorial;


public class Aula2TiposPrimitivos {
    public static void main(String[] args) {
        long NumeroGrande = (int) 10000000L; // AQUI EU COLOQUEI UM NUMERO INTEIRO DENTRO DE UM LONG
        short numeroCurto = 2300; // numero curto aqui.
        float numerodecimalprecisaosimples = (int) 25000F; // NUMERO INTEIRO DENTRO DE UM FLOAT.
        double numerodecimalprecisaodupla = (float) 2500D; // NUMERO FLOAT DENTRO DE UM DOUBLE.
        char caractere = '\u0041'; // Letra, Número ou Simbomlo (único).
        boolean falso = false; // Número lógico falso ou verdadeiro.
        boolean verdadeiro = true; // Número lógico falso ou verdadeiro.
        byte Idadebyte = 127; // Número intenrio 0 à 127.
        String nome = "Ronny"; // Não é um tipo primitivo! sequência de caracteres, diferente de char.

        System.out.println("Short (Número curto) : " + numeroCurto);
        System.out.println("Float (Decimal Simples: ) " + numerodecimalprecisaosimples);
        System.out.println("Double (Decimal Dupla: )" + numerodecimalprecisaodupla);
        System.out.println("Char (único Caractere) : " + caractere);
        System.out.println("Boolean (Verdadeiro ou Falso): " + falso);
        System.out.println("Boolean (Verdadeiro ou Falso): " + verdadeiro);
        System.out.println("Byte (Inteiro 0 à 127) : " + Idadebyte);
        System.out.println("String (Múltiplos caracteres: )" + nome);

    }
}