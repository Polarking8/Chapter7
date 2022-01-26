package RN_A;
import java.util.Arrays;
import java.util.Scanner;
public class RandomNumberArrayTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        RandomNumberArray numberArray = new RandomNumberArray();
        System.out.println("Enter the seed for the numbers to generate from (as an integer number):");
        int seed = in.nextInt();
        System.out.print("The unsorted array is: " + Arrays.toString(numberArray.unsortedSequence(seed)) +"\n");
        System.out.print("The sorted array is: " + numberArray.sortedSequence(seed));
    }
}
