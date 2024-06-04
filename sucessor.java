import java.util.Scanner;

public class sucessor {
    public static void main(String[] args){
        Scanner ui = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numeroint = ui.nextInt();

        int numerosucessor = numeroint + 1;

        int numeroantecessor = numeroint - 1;

        System.out.println("O número sucessor ao que você inseriu é: " + numerosucessor + ". Já o antecessor a ele, é: " +numeroantecessor);
    }
}
