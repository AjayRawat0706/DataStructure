/*
program to pint boundary elements in a 2-d array
I.P.: 2  3  4  5
      6  7  8  9
      12 13 14 15

O.P.: 2 3 4 5 9 15 14 13 12 6
 */

package Matrix;

public class MatrixBoundaryElement {
    static void BoundaryElements(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        if(n==2){
            for (int i=0;i<m;i++){
                System.out.print(matrix[0][i]+" ");
            }
            for (int i=matrix[1].length-1;i>=0;i--){
                System.out.print(matrix[1][i]+" ");
            }
        }
        else{
            for(int i=0;i<m;i++){
                System.out.print(matrix[0][i]+" ");
            }
            for (int j=1;j<n;j++){
                System.out.print(matrix[j][m-1]+" ");
            }
            for (int i=m-2;i>=0;i--){
                System.out.print(matrix[n-1][i]+" ");
            }
            for (int j=n-2;j>0;j--){
                System.out.print(matrix[j][0]+" ");
            }

        }

    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{11,12,13,14},{10,20,30,40}};
        BoundaryElements(arr);
    }
}
