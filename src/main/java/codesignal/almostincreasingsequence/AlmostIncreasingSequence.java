package codesignal.almostincreasingsequence;

import java.util.Arrays;

public class AlmostIncreasingSequence {
    public static void main(String[] args) {
        int[] sequence = {1, 3, 2};
        System.out.println(almostIncreasingSequence(sequence));
    }

    public static boolean almostIncreasingSequence(int[] sequence) {

        int offenderPosition = 0;
        int[] arrCopy = Arrays.copyOf(sequence, sequence.length);
        boolean ordered = true;


//trying to neatly rewrite this for loop
        for (int i = 0; i < sequence.length; i++) {
            if (i < sequence.length - 1) {
                for (int j = i + 1; j < sequence.length; j++) {
                    if (!(sequence[i] < sequence[j])) {
                        ordered = false;
                        offenderPosition = i;
                    }
                }
            }
            if (i == sequence.length - 1) {
                if (!(sequence[i] > sequence[i - 1])) {
                    ordered = false;
                    offenderPosition = i;
                }
            }

        }


        if (ordered == false) {
            //remove offender
            int currentSize = arrCopy.length;
            for (int i = offenderPosition + 1; i < currentSize; i++) {
                arrCopy[i - 1] = arrCopy[i];
            }
            currentSize--;

            //reassign array
            arrCopy = Arrays.copyOf(arrCopy, currentSize);

            boolean lastChance = true;

            for (int i = 0; i < currentSize - 1; i++) {
                for (int j = i + 1; j < currentSize; j++) {
                    if (!(arrCopy[i] < arrCopy[j])) {
                        lastChance = false;
                    }
                }
            }
            return lastChance;
        } else{
            return true;
        }
    }
}
