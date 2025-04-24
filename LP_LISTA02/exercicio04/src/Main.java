import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite a primeira nota: ");
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double number2 = in.nextDouble();
        double average = (number + number2) / 2;
        System.out.println("A média das notas digitadas é: " + average);
    }
}