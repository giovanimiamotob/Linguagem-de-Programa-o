import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite a base de um triangulo retangulo: ");
        Scanner in = new Scanner(System.in);
        double base = in.nextDouble();
        System.out.println("Digite a altura de um triangulo retangulo: ");
        double height  = in.nextDouble();

        double area = (base*height)/2;

        System.out.println("A area do triangulo retangulo é: " + area);
    }
}