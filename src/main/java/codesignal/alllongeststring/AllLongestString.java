package codesignal.alllongeststring;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class AllLongestString {
    public static void main(String[] args) {

        String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};
        String[] outputArray = allLongestStringSolution(inputArray);
        System.out.println(Arrays.toString(outputArray));
    }
    public static String[] allLongestStringSolution(String[] inputArray) {
        List<String> inputList = Arrays.stream(inputArray)
                .toList();

        int longestStringLength = inputList.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(1)
                .mapToInt(String::length)
                .sum();

        List<String> resultList = inputList.stream()
                .filter(s -> s.length() == longestStringLength)
                .toList();

        return resultList.toArray(String[]::new);

    }
}
