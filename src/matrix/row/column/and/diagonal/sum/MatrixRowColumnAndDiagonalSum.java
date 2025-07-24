
package matrix.row.column.and.diagonal.sum;

/**
 *
 * @author Imran Shihan
 */
public class MatrixRowColumnAndDiagonalSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int[][] matrix = {{3, 4, 9}, {2, 9, 11}, {4, 6, 0}};
    int secondRowSum = 0;
    for(int j = 0; j <3; j++){
        secondRowSum += matrix[1][j];
    }
    int thirdColSum = 0;
    for(int i = 0; i < 3; i++){
        thirdColSum += matrix[i][2];
    }
    
    int mainDiag = matrix[0][0] + matrix[1][1] + matrix[2][2];
    int secDiag = matrix[0][2] + matrix[1][1] + matrix[2][0];
        System.out.println("Sum of Second row: " +secondRowSum);
        System.out.println("Sum of thirs column: " +thirdColSum);
        System.out.println("Sum of main Diagonal: " +mainDiag);
        System.out.println("Sum of secondary Diagonal: " +secDiag);
    }
}
