import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite um valor m/s para transformar em Km/h: ");
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        System.out.println("O número digitados em M/s equivale a: " + (number*3.6) + "Km/h");
    }
}