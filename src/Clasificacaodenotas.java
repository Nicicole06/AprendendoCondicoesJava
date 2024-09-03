import java.util.Scanner;

public class Clasificacaodenotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno (0 a 100): ");
        int nota = scanner.nextInt();

        if (nota >= 70) {
            System.out.println("Feedback: Bom");
        } else if (nota >= 40) {
            System.out.println("Feedback: Medíocre");
        } else {
            System.out.println("Feedback: Ruim");
        }

        scanner.close();
    }
}
