package tutorial;
// Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
//Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.

import javax.xml.crypto.Data;
import java.util.Scanner;

public class Aula3TiposPrimitivosExercicio {
    String nome;
    String endereco;
    String date;
    int salario;

    public static void main (String[] args){

        Aula3TiposPrimitivosExercicio A = new Aula3TiposPrimitivosExercicio();
        A.nome = "Joao";
        A.endereco = "Rua do Silva";
        A.date = "30/03/2001";
        A.salario = 5000;

        System.out.println("Eu " + A.nome + ", morando no endereço " + A.endereco + ", confirmo que recebi o salário de " + A.salario + " na data " + A.date + ".");
        ;


    }
}