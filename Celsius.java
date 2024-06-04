import java.util.Scanner;

public class Celsius {
    public static void main(String[] args){
        Scanner gr = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Clesius:");
        double celsiustempe = gr.nextDouble();

        double graufairi = celsiustempe * (9.0 / 5.0) + 32.0;

        System.out.println("Essa temperatura em graus Fahrenheit é de: " + graufairi);


    }
}
