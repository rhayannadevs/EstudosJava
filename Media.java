import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        Scanner pt = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valorum = pt.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valordois = pt.nextInt();

        System.out.println("Digite o terceiro valor: ");
        int valortres = pt.nextInt();

        int resultadototal = (valorum + valordois + valortres) / 3;

        System.out.println("O resultado da media é: " + resultadototal);

    }
}