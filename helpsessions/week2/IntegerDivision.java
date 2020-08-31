public class YourProgram {
    public static double divide(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;
        System.out.println("Num1 is " + num1);
        System.out.println("Num2 is " + num2);

        double quotient = divide(num1, num2);
        System.out.println("Quotient is " + quotient);
    }
}