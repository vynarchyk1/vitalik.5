import java.util.Scanner;

public class RhombusAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть довжину першої діагоналі ромба:");
        double diagonal1 = scanner.nextDouble();

        System.out.println("Введіть довжину другої діагоналі ромба:");
        double diagonal2 = scanner.nextDouble();

        double area = calculateRhombusArea(diagonal1, diagonal2);
        System.out.println("Площа ромба: " + area);

        scanner.close();
    }

    // Метод для обчислення площі ромба
    public static double calculateRhombusArea(double diagonal1, double diagonal2) {
        return (diagonal1 * diagonal2) / 2;
    }
}
