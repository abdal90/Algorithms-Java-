import java.util.Scanner;

public class Fibonacci {

    // Computes and prints the first n Fibonacci numbers.

    // WARNING:  this program is spectacularly inefficient and is meant to illustrate a performance bug, e.g., set n = 45.

    private static int fibonacci(int number){
        // base case
        if (number <= 1){
            return number;
        }

        //tail recursion
        return fibonacci(number-1) + fibonacci(number - 2);
    }

    public static void main(String[] args) {
        //input to print Fibonacci series upto how many numbers
        System.out.println("Enter number up to which Fibonacci series to print: ");
        int number = new Scanner(System.in).nextInt();

        System.out.println("Fibonacci series upto " + number +" numbers : ");
        //printing Fibonacci series upto number
        for(int i=1; i<=number; i++){
            System.out.print(fibonacci(i) +" ");
        }
    }


}


