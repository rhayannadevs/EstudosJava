import java.util.Scanner;

public class salariominimo {
    public static void main(String[] args){
        Scanner ar = new Scanner (System.in);

        System.out.println("Informe o seu salário:");
        float salariousuario = ar.nextFloat();

        float salariominimo = 788;

        if (salariousuario < salariominimo){
            System.out.println("Seu salário é inferior a um salário mínimo, pobre!");
        }else {
            float qtdsalarios = salariousuario / salariominimo;
            System.out.println("Seu salário corresponte a " + String.format("%.1f", qtdsalarios) + " salários minimos.");
        }
    }
}
