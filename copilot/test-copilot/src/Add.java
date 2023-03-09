public class Add {
    //function to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }
    //function to subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }
    //function to multiply three numbers
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    //non static method to add two numbers without return type
    public void addNonStatic(int a, int b) {
        System.out.println(a + b);
    }



}
