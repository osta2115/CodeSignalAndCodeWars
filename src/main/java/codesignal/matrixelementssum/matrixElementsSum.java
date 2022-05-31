package codesignal.matrixelementssum;

public class matrixElementsSum {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,1,2},
                         {0,5,0,0},
                         {2,0,3,3}};
        System.out.println(solution(matrix));
    }
    public static int solution(int[][] matrix) {
        int sum = 0;
        for(int i = 0; i < matrix[0].length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                if(matrix[j][i] == 0){
                    break;
                }
                sum += matrix[j][i];
            }
        }
        return sum;
    }
}
