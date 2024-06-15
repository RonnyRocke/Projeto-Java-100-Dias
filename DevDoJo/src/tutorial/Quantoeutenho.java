import java.util.Scanner;

public class Quantoeutenho {

    String nome;
    int idade;
    float saldocorrente;
    float saldopoupanca;
    float salario;
    float PS5;
    double parapodercomprar;

    public static void main (String[] args){
        Quantoeutenho qet = new Quantoeutenho();
        Scanner entrada =  new Scanner(System.in);
        System.out.print("DIGITE SEU NOME: ");
        qet.nome = entrada.nextLine(); ;

        System.out.print("DIGITE SEU IDADE: ");
        qet.idade = entrada.nextInt();

        System.out.print("DIGITE SEU SALDO DA SUA CONTA CORRENTE: ");
        qet.saldocorrente = entrada.nextFloat();

        System.out.print("DIGITE SEU SALDO DA SUA CONTA POUPANÇA: ");
        qet.saldopoupanca = entrada.nextFloat();

        qet.PS5 =  5500F;
        qet.salario = qet.saldocorrente + qet.saldopoupanca;
        qet.parapodercomprar = qet.PS5 - qet.salario;

        boolean darparacompraroPS5 = qet.salario >= qet.PS5;

        if (darparacompraroPS5){
            System.out.println("VOCÊ POSSUI " + "R$" + qet.saldocorrente + " NA CONTA CONRRENTE.");
            System.out.println("VOCÊ POSSUI " + "R$" + qet.saldopoupanca + " NA CONTA POUPANÇA.");
            System.out.println("NO TOTAL VOCÊ POSSUI "  + "R$"+ qet.salario);
            System.out.println("O PS5 CUSTA: " + "R$"+ qet.PS5);
            System.out.println("SIM, VOCÊ CONSEGUE COMPRAR O PS5" + darparacompraroPS5);
        }
        else {
            System.out.println("NÃO, VOCÊ NÃO CONSEGUE COMPRAR O PS5" + darparacompraroPS5);
            System.out.println("VOCÊ POSSUI " + "R$ " + qet.salario);
        System.out.println("VOCÊ PRECISA DE " + "R$" + qet.parapodercomprar + " PARA COMPRAR O PS5.");
            System.out.println("O PS5 CUSTA: " + "R$" + qet.PS5);
        }
    }
}
