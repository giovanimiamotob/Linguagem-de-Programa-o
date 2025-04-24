import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o raio do circulo: ");
        Scanner in = new Scanner(System.in);

        double radius = in.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("A area do circulo é: " + area);
    }
}