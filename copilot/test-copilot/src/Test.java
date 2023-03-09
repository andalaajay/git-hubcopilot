public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //call the add method
        int sum = Add.add(1, 2);
        System.out.println(sum);
        //call the sqrt method
        double sqrt = MathUtils.sqrt(9);
        System.out.println(sqrt);
        //call the factorial method
        int factorial = MathUtils.factorial(5);
        System.out.println(factorial);
        //call non static factorial method
        MathUtils mathUtils = new MathUtils();
        int factorialNonStatic = mathUtils.factorialNonStatic(5);
        System.out.println(factorialNonStatic);

    }
}
