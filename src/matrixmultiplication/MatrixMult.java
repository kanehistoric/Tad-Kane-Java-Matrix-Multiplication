
package matrixmultiplication;

/**
 *
 * @author Tad Kane
 */
public class MatrixMult {
    
    //no constructor
    
    static int[][] mult(int[][] A, int[][]B)
    {
        int C[][] = new int[A.length][B[0].length];
        
        for (int columns = 0; columns < B[0].length; columns++)   //columns in 2nd matrix
        {
            for (int rows = 0; rows < A.length; rows++)
            {
                int matrixSum = 0;
                for(int x = 0; x < B.length; x++)
                {
                    matrixSum += A[rows][x]*B[x][columns];
                }
                C[rows][columns] = matrixSum;
            }
        }
        return C;
    }
   
}
