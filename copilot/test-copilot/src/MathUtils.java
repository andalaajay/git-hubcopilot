public class MathUtils {
    //function to check if a number is prime
    public static boolean isPrime(int num) {
        //check if the number is less than 2
        if (num < 2) {
            //if it is, return false
            return false;
        }
        //loop through the numbers from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            //check if the number is divisible by any of the numbers
            if (num % i == 0) {
                //if it is, return false
                return false;
            }
        }
        //if the loop completes, return true
        return true;
    }
    //function to find square root of a number
    public static double sqrt(int num) {
        //create a variable to store the square root
        double sqrt = 1;
        //loop through the numbers from 1 to the number
        for (int i = 1; i <= num; i++) {
            //check if the square of the number is greater than the number
            if (i * i > num) {
                //if it is, set the square root to the previous number
                sqrt = i - 1;
                //break out of the loop
                break;
            }
        }
        //loop through the numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            //calculate the square root
            sqrt = (sqrt + num / sqrt) / 2;
        }
        //return the square root
        return sqrt;
    }
    //function to find the factorial of a number
    public static int factorial(int num) {
        //create a variable to store the factorial
        int factorial = 1;
        //loop through the numbers from 1 to the number
        for (int i = 1; i <= num; i++) {
            //multiply the factorial by the number
            factorial *= i;
        }
        //return the factorial
        return factorial;
    }
    //non static method to find the factorial of a number
    public int factorialNonStatic(int num) {
        //create a variable to store the factorial
        int factorial = 1;
        //loop through the numbers from 1 to the number
        for (int i = 1; i <= num; i++) {
            //multiply the factorial by the number
            factorial *= i;
        }
        //return the factorial
        return factorial;
    }


}
