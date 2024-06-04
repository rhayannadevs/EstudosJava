import java.util.Scanner;

public class mediaprova {
    public static void main(String[] args){
        Scanner ls = new Scanner(System.in);

        System.out.println("Digite a nota da sua primeira prova: ");
        int primeiranota = ls.nextInt();

        System.out.println("Agora, digite a nota da sua segunda prova: ");
        int segundanota = ls.nextInt();

        System.out.println("Para saber o resultado, digite a nota da terceira prova: ");
        int terceiranota = ls.nextInt();

        int resultadomedia = (primeiranota + segundanota + terceiranota) / 3;

        if (resultadomedia >= 6){
            System.out.println("A sua nota foi: " +resultadomedia+ ". Você foi aprovado!");
        }else{
            System.out.println("A sua nota foi: " +resultadomedia+ ". Você foi reprovado!");
        }

    }
}
