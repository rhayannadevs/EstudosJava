import java.util.Scanner;

public class AnosEmDias {
    public static void main(String[] args){
        Scanner kp = new Scanner (System.in);

        System.out.println("Digite quantos anos você tem:");
        int valorAnos = kp.nextInt();

        System.out.println("E quantos meses?");
        int valorMeses = kp.nextInt();

        System.out.println("E dias?");
        int valorDias = kp.nextInt();

        int valorCalculoAno = 365 * valorAnos;

        int valorCalculoMeses = 30 * valorMeses;

        int totalEmDias = valorCalculoAno + valorCalculoMeses + valorDias;

        System.out.println("Você já viveu por " + totalEmDias);
    }
}
