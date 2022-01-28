package Fibonacci;
import java.util.Scanner;
public class FibTester {
    public static void main(String[] args) {
        Fib_loop Fibonacci = new Fib_loop();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the nth term of fibonacci you want to find: ");
        int fibNumber = in.nextInt();
        System.out.println(Fibonacci.findNthFibNumber(fibNumber));
    }
}
