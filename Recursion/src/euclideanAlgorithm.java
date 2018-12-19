public class euclideanAlgorithm {

    // GCD of two numbers is the largest number that divides both of them.
    // A simple way to find GCD is to factorize both numbers and multiply common factors


    private static int Euclidean(int firstNumber, int secondNumber){

        // base case - return when first number equals 0
        if (firstNumber == 0){
            return secondNumber;
        }

        // we divide smaller number, the algorithm stops when we find remainder 0.
        return Euclidean(secondNumber % firstNumber, firstNumber);

    }

    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 15;
        int GCD;

        GCD = Euclidean(firstNumber, secondNumber);
        System.out.println("Greatest Common Denominator(" + firstNumber + " , " + secondNumber + ") = " + GCD);

    }

}
