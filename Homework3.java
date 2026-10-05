import java.util.Scanner;

public class Homework3 {
    public void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();

        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }

        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}