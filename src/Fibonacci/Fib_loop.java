package Fibonacci;

public class Fib_loop {
    public int findNthFibNumber(int n){
        int nth = 0;
        int num1 = 1;
        int num2 = 1;
        int newNum = 0;
        for(int i = 2; i<n; i++){
        newNum = num1+num2;
        num2 = num1;
        num1 = newNum;
        }
        nth = newNum;
        return nth;
    }
}
