package Fibonacci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FibonacciTest {
    @Test
    public void fibonacciFourteenTest(){
        Fib_loop Fibonacci ;
        Fibonacci = new Fib_loop();
        Assertions.assertEquals(377, Fibonacci.findNthFibNumber(14));
    }
    @Test
    public void fibonacciThirtySixTest(){
        Fib_loop Fibonacci ;
        Fibonacci = new Fib_loop();
        Assertions.assertEquals(14930352, Fibonacci.findNthFibNumber(36));
    }
}
