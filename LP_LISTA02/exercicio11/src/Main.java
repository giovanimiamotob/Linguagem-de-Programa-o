import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite uma temperatura em celsius: ");
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        double fahrenheit = (number * 9 / 5) + 32;
        System.out.println("A temperatura digitada em celsius equivale a: " + fahrenheit+ " fahrenheit");
    }
}