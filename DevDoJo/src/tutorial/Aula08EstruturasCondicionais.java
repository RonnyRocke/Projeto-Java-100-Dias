import java.util.Scanner;

public class Aula08EstruturasCondicionais {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("DIGITE UM PRODUTO: ");
        String Produto = entrada.nextLine();

        String fruta1 = "VOCÊ COMPROU UMA MAÇA";
        String fruta2 = "VOCÊ COMPROU UMA LARANJA";
        String fruta3 = "VOCÊ COMPROU UM MELÃO";
        String fruta4 = "VOCÊ COMPROU UMA JACA";
        String fruta5 = "VOCÊ COMPROU UMA BANANA";
        String erro = "OPÇÃO INVÁLIDA!";

        switch(Produto){
            case "MAÇA":
                System.out.println(fruta1);
                break;

            case "LARANJA":
                System.out.println(fruta2);
                break;

            case "MELÃO":
                System.out.println(fruta3);
                break;

            case "JACA":
                System.out.println(fruta4);
                break;

            case "BANANA":
                System.out.println(fruta5);
                break;

            default:
                System.out.println(erro);
                break;
        }
    }
}