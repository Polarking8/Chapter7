package Fibonacci;

public class Fib_loop {
    public int findNthFibNumber(int n){
        int nth = 0;
        int num1 = 1;
        int num2 = 1;
        int newNum = 0;
        for(int i = 2; i<=n; i++){
        newNum = num1+num2;
        num2 = num1;
        num1 = newNum;
        }
        nth = newNum;
        return nth;
    }
}
//The Fibonacci numbers are defined by the sequence
//f1 = 1
//f2 = 1
//fn = fn−1 + fn−2
//Reformulate that as
//fold1 = 1;
//fold2 = 1;
//fnew = fold1 + fold2;
//After that, discard fold2, which is no longer needed, and set fold2 to fold1 and fold1 to fnew.
// Repeat an appropriate number of times.
//Implement a program that prompts the user for an integer n and prints the nth
//Fibonacci number, using the above algorithm.
//Create a UML diagram, and a flow chart.
//Be sure you have separate classes for your tester
// (the class which performs the I/O and runs your application) and your business logic.
//Create a JUnit test.
//All diagrams MUST be included in your repo.
// They will be counted as missing if they are in a separate application, such as Google Docs.
