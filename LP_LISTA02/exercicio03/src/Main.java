import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        System.out.println("A quita parte do número digitado é: " + (number / 5));
    }
}