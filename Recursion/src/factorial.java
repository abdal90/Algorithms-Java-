import java.util.Scanner;
public class factorial {
    // java factorial
        // Reads an integer command-line argument n, and prints n! = 1 * 2 * ... * n
        // to standard output
    // Remarks
        //- Would overflow a long if n > 20
        //- Need to use extended precision arithmetic to handle bigger factorials
    private static long Factorial(long n){
        if (n < 0){
            throw new RuntimeException("underflow error in factorial. Cannot be negative");
        }else if (n > 20){
            throw new RuntimeException("underflow error in factorial. Numbers limited below 20");
        }else if (n == 0){
            return 1;
        }else {
            // recursively return
            return n * Factorial(n-1);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");

        long number = scanner.nextLong();
        System.out.println("Factorial of " + number + " is: " + Factorial(number));
    }

}
