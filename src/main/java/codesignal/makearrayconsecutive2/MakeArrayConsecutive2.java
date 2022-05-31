package codesignal.makearrayconsecutive2;

import java.util.Arrays;
import java.util.List;

public class MakeArrayConsecutive2 {
    public static void main(String[] args) {
        int[] statues = new int[] {6, 2, 3, 8};
        System.out.println(solution(statues));
    }

    public static int solution(int[] statues) {
        List<Integer> listStatues = Arrays.stream(statues)
                .boxed()
                .sorted()
                .toList();

        Integer biggestSize = listStatues.stream()
                .max(Integer::compare)
                .get();

        Integer lowestSize = listStatues.stream()
                .min(Integer::compare)
                .get();

//        return listStatues.stream()
//                .reduce(0, (actualSize, nextSize) -> nextSize - actualSize) - 1;
        return biggestSize - lowestSize + 1 - listStatues.size();
    }
}
