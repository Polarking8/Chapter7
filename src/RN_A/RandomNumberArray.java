package RN_A;
import java.util.Arrays;
import java.util.Random;
public class RandomNumberArray {
    public static int[] addNum(int n, int[] arr, int x){
        int i;
        int[] newArray = new int[n + 1];
        for (i = 0; i < n; i++)
            newArray[i] = arr[i];
        newArray[n] = x;
        return newArray;
    }
    public int[] unsortedSequence(int seed){
        int i = 0;
        Random random = new Random();
        random.setSeed(seed);
        int [] numbers = new int[20];
        while(i<20){
            numbers = addNum(i,numbers,random.nextInt(0,99));
            i++;
        }
        return (numbers);
    }
    public String sortedSequence(int seed){
        int[] sortedNumbers = unsortedSequence(seed);
        Arrays.sort(sortedNumbers);
        return Arrays.toString(sortedNumbers);
    }
}
