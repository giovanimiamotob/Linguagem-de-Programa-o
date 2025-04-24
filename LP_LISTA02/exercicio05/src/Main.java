import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite um valor em Km/h para transformar em metros por segundos: ");
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        System.out.println("O número digitados em km equivale a: " + (number/3.6) + "metros por segundos");
    }
}