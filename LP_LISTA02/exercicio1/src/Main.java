import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println("O dobro do número digitado é: " + (number * 2));
    }
}