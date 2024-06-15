/*EXERCÍCIO: CRIE UM PROGRAMA EM JAVA QUE
CALCULE 30% DE 2000, 20% DE 600 E 15% DE 1500. */
public class DescobrindoAPorcetagem {
    double salario;
    double porcentagem;
    double resultado;

    public static void main(String[] args) {
        DescobrindoAPorcetagem DAP = new DescobrindoAPorcetagem();
        DAP.salario = 2000;
        DAP.porcentagem = 30;
        DAP.resultado = DAP.salario * DAP.porcentagem / 100;
        System.out.println("30% DE 2000 É: " + DAP.resultado);

        DAP.salario = 600;
        DAP.porcentagem = 20;
        DAP.resultado = DAP.salario * DAP.porcentagem / 100;
        System.out.println("20% DE 600 É: " + DAP.resultado);

        DAP.salario = 1500;
        DAP.porcentagem = 15;
        DAP.resultado = DAP.salario * DAP.porcentagem / 100;
        System.out.println("15% DE 1500 É: " + DAP.resultado);
    }
}
