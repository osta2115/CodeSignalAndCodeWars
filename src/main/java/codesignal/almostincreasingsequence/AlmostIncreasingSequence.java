package codesignal.almostincreasingsequence;

import java.util.Arrays;

public class AlmostIncreasingSequence {
    public static void main(String[] args) {
        int[] sequence = {1, 3, 2};
        System.out.println(almostIncreasingSequence(sequence));
    }

    public static boolean almostIncreasingSequence(int[] sequence) {
        int count1 = 0 , count2 = 0;
        for(int i = 0 ; i < sequence.length-1 ; i++){
            if(sequence[i] >= sequence[i+1]) count1++;
        }

        for(int i = 0 ; i < sequence.length-2 ; i++){
            if(sequence[i] >= sequence[i+2]) count2++;
        }
        return (count1 <=1) && (count2 <= 1);
    }
}
