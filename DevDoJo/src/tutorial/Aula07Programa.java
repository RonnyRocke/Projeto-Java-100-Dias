package tutorial;

public class Aula07Programa {
    // PRIMEIRO PROGRAMA EM JAVA SEM CONSULTA
    // NESTE PROGRAMA ESTOU VERIFICANDO SE POSSUO SALDO PARA COMPRAR UM PS5

    float salario;
    float conta_poupanca;
    float conta_corrente;
    double Pcx;
    double total;

    public static void main(String[] args) {

        Aula07Programa A7P = new Aula07Programa();
        A7P.salario = 8000;
        A7P.conta_poupanca = 6000;
        A7P.conta_corrente = 1000;
        A7P.Pcx = 8000;
        A7P.total = A7P.conta_corrente + A7P.conta_poupanca;

        boolean darparacomprar = A7P.total > 8000 || A7P.total == 8000;

        if (darparacomprar) {
            System.out.println("VALOR DA PCX: " + A7P.Pcx + ", DAR PARA COMPRAR? " + " SIM, VOCE POSSUI:  " + A7P.total + darparacomprar);
        }

        else {
            System.out.println("VALOR DA PCX: " + A7P.Pcx + ", DAR PARA COMPRAR?" + " NÃO, VOCE NÃO POSSUI SALDO SUFICIENTE!" + darparacomprar);
        }



    }
}