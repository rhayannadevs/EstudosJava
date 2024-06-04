import java.util.Scanner;

public class Soma {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		int valor = sc.nextInt();

		System.out.println("Digite o segundo valor: ");
		int valor2 = sc.nextInt();

		System.out.println("Digite o terceiro valor: ");
		int valor3 = sc.nextInt();

		int resultado = valor + valor2 + valor3;

		System.out.println("O resultado da soma é: " + resultado);
		
		} 
	}