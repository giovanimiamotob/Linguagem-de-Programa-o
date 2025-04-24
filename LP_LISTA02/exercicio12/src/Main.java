import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite a primeira nota: ");
        Scanner in = new Scanner(System.in);
        double score1 = in.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double score2 = in.nextDouble();

        int weight1 = 1;
        int weight2 = 2;
        double avarege = (score1 * weight1 + score2 * weight2) / (weight1 + weight2);

        if(avarege < 0){
            avarege = 0;
        } else if (avarege > 10) {
            avarege = 10;
        }
        System.out.println("A média ponderada é: " + avarege);
    }
}