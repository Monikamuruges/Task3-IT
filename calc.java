public class Calc {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int subtract(int a, int b) {
        return a - b;
    }
    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
       if (b == 0) {
          throw new ArithmeticException("Division by zero is not allowed");
    }
        return a / b;
}

    public static void main(String[] args) {
        System.out.println("Calculator program");
    }
}
