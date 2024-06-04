import java.util.Scanner;

public class kelvin {
    public static void main(String[] args){
        Scanner kr = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus clesius:");
        double graucelsius = kr.nextDouble();

        double graukelvin = graucelsius + 273.15;

        System.out.println("A temperatura inserida se convertida em graus Kelvin é: " +graukelvin);
    }
}
