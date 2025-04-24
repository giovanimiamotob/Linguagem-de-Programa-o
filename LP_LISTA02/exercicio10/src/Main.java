import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite uma distancia em milhas: ");
        Scanner in = new Scanner(System.in);
        double number = in.nextDouble();
        System.out.println("A distancia digitada em milhas equivale a: " + (number*1.609) + " kilometros");
    }
}