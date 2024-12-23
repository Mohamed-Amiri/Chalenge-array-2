import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[10];
        double sum = 0;

        System.out.println("Veuillez entrer 10 nombres décimaux :");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }

        double average = sum / numbers.length;

        System.out.println("\nSomme des éléments : " + sum);
        System.out.println("Moyenne des éléments : " + average);
    }
}
