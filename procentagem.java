import java.util.Scanner;

public class procentagem {
    public static void main(String[] args){
        Scanner jl = new Scanner(System.in);

        System.out.println("Digite um saldo:");
        double saldoinserido = jl.nextDouble();

        double decimaldosaldoinserido = saldoinserido * (1.0/100.0);

        double totaldaporcentagem = saldoinserido + decimaldosaldoinserido;

        System.out.println("O valor inserido se adicionado 1%, fica no total de: " + totaldaporcentagem);
    }
}
