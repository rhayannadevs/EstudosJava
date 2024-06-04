import java.util.Scanner;

public class numeromaior {
    public static void main(String[] args){
        Scanner fg = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int primeironum = fg.nextInt();

        System.out.println("Digite o segundo número:");
        int segundonum = fg.nextInt();

        if (primeironum > segundonum){
                System.out.println("O número maior é: " +primeironum);
        } else{
            System.out.println("O número maior é: " +segundonum);
        }
    }
}
