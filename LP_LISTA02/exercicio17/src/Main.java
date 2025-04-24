import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite velocidade inicial do corpo: ");
        Scanner in = new Scanner(System.in);
        double velocity = in.nextDouble();
        System.out.println("Digite a aceleração do corpo: ");
        double acceleration = in.nextDouble();
        System.out.println("Digite o tempo do percurso do corpo: ");
        double time = in.nextDouble();

        double finalVelocity = velocity + (acceleration * time);

        System.out.println("A velocidade do corpo é: " +finalVelocity + " m/s" );
    }
}