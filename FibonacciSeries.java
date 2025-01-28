import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of terms
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = scanner.nextInt();

        // Variables to store the first two terms
        int first = 0, second = 1;

        // Print Fibonacci series
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " "); // Print the current term

            // Generate the next term
            int temp = first;
            first = second;
            second = temp + second;
        }

        scanner.close();
    }
}
