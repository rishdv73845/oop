import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i <= 5; i++) {
            System.out.print("Enter input " + i + "/5 :");
            int input = sc.nextInt();
            sum += input;
            System.out.println("Current sum: " + sum);
        }
        sc.close();
    }
}
