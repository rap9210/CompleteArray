import java.lang.reflect.Array;
import java.util.Arrays;

public class CompleteArray {
    public static void main(String[] args) {
        int[] numbers = {2, 29, 33, 4, 15, 62, 7, 81, 9, 10};
        /*
        To return and print the sum of each integer element of an array.
        Use a for loop to pull each element and a variable inside the loop to store it.
         */
        System.out.println("Numbers:"+Arrays.toString(numbers));
        int l = Array.getLength(numbers); // <<
        int sum_1 = 0; // << initialize integer variable to hold sum during loop
        for (int i=0; i<=l-1;i++){
            sum_1 +=numbers[i];
            if (i==l-1){
                System.out.println("The sum of the elements of 'Numbers' is: "+sum_1);
            }
        }

    }
}
