import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o raio de um cilindro: ");
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        System.out.println("Digite a altura do cilindro: ");
        double height = in.nextDouble();
        // Fórmula da área do círculo: A = π * r²
        double volume = Math.PI * Math.pow(radius, 2) * height;

        System.out.println("O volume do cilindro é: " +volume );
    }
}