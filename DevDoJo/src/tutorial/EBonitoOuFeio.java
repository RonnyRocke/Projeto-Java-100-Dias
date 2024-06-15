import java.util.Scanner;

public class EBonitoOuFeio{
    String nome;
    String FEIO;
    String BONITO;

    public static void main(String[] args) {
        EBonitoOuFeio EBOF = new EBonitoOuFeio();
        Scanner entrada = new Scanner(System.in);

        System.out.print("DIGITE O SEU NOME PARA SABER SE VOCÊ É BONITO: ");
        EBOF.nome = entrada.nextLine();
        
        entrada.close();

        switch (EBOF.nome) {
            case "ronny":
            System.out.println(EBOF.nome + " VOCÊ É BONITO/BONITA!");
            break;

            case "ronald":
            System.out.println(EBOF.nome + " VOCÊ É BONITO/BONITA!");
            break;

            case "Ronny":
            System.out.println(EBOF.nome + " VOCÊ É BONITO/BONITA!");
            break;

            case "Ronald":
            System.out.println(EBOF.nome + " VOCÊ É BONITO/BONITA!");
            break;

            case "rone":
            System.out.println(EBOF.nome + " VOCÊ É BONITO/BONITA!");
            break;

            case "rony":
            System.out.println(EBOF.nome + " VOCÊ É BONITO/BONITA!");
            break;

            case "Rony":
            System.out.println(EBOF.nome + " VOCÊ É BONITO/BONITA!");
            break;

            case "RONNY":
            System.out.println(EBOF.nome + " VOCÊ É BONITO/BONITA!");
            break;

            case "RONALD":
            System.out.println(EBOF.nome + " VOCÊ É BONITO/BONITA!");
            break;

            default:
            System.out.println(EBOF.nome + " VOCÊ É FEIO/FEIA!");
                break;
    
        }

    }
}