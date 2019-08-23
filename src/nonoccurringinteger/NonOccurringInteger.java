package nonoccurringinteger;

import java.util.Arrays;

/**
 *
 * @author unogwudan
 */
public class NonOccurringInteger {
    
    public static int solution(int[] arr) {
        int smallestInt = 1;

        if (arr.length == 0) {
            return smallestInt;
        }

        Arrays.sort(arr);

        if (arr[0] > 1) {
            return smallestInt;
        }
        if (arr[arr.length - 1] <= 0) {
            return smallestInt;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == smallestInt) {
                smallestInt++;
            }
        }

        return smallestInt;
    }

    public static void main(String[] args) {
        int[] j = {1, 6, 4, 2, 5};
        System.out.println(NonOccurringInteger.solution(j));
    }
    
}
