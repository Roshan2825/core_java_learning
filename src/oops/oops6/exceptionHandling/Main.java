package oops.oops6.exceptionHandling;

public class Main {
    public static void main (String[] args) throws MyException {
        int a=5;
        int b=0;
        try {
         int c=divide(a, b);
         String name="Kunal";
         if(name.equals("Kunal"))  {
            throw new MyException("my name is Kunal");
         }
        System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
    static int divide(int a, int b) throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}
