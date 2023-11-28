import java.util.Arrays;
//transpose of a matrix(2d array)
public class transpose {
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(transpose(matrix)));
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] arr=new int[matrix[0].length ][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                arr[j][i]=matrix[i][j];
            }
        }return arr;

    }
}
