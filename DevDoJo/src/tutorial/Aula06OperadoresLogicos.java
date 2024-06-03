package tutorial;

public class Aula06OperadoresLogicos {
    // USANDO OR ||   AND &&
    int idade;
    String nome;
    float salario;

    public static void main (String[] args) {
        Aula06OperadoresLogicos AP = new Aula06OperadoresLogicos();
        AP.idade = 23;
        AP.nome = " Ronny ";
        AP.salario = 1500;

        boolean vintetresMaiorQue = AP.idade >= 25 && AP.salario <= 900;
        boolean vintetresMenorQue = AP.idade <=  30 && AP.salario >= 500;

        System.out.println("Idade: " + AP.idade + ", Salário: " + AP.salario + vintetresMenorQue + "/ VERDADEIRO.");
        System.out.println("Idade: " + AP.idade + ", Salário: " + AP.salario + vintetresMaiorQue + "/ FALSO.");

    }
}
