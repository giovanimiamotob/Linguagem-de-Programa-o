import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite um valor em milimetros: ");
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        System.out.println("O número digitados em milimetros equivale a: " + (number/25.4) + "polegadas");
    }
}