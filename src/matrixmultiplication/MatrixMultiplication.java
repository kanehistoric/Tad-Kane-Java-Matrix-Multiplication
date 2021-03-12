
package matrixmultiplication;
import java.util.Scanner;
import static java.lang.System.*;
/**
 *
 * @author Tad Kane
 */
public class MatrixMultiplication 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        //Rows and Columns for Matrix A
        out.println("Array A:  How many rows? ");
        int rowA = input.nextInt();
        out.println("Array A:  How many columns? ");
        int columnA = input.nextInt();
                
         //Rows and Columns for Matrix B
        out.println("Array B:  How many rows? ");
        int rowB = input.nextInt();
        out.println("Array B:  How many columns? ");
        int columnB = input.nextInt();
        
        int a[][] = new int[rowA][columnA];
        int b[][] = new int[rowB][columnB];
        
           
        if (columnA != rowB) 
        {
            out.println("Sorry the number of columns in Matrix A \ndoes not equal the number of rows in Matrix B.");
            out.println("So, AB is undefined.");
        }
        else
        {// Take in values for Matrix A
            out.println("Array A data input:");
            for(int i = 0; i < a.length; i++) 
            { // a.length is the number of rows.
                for(int j =0; j < a[0].length; j++)     // a[0].length is the number of columns
                {
                    out.print("Please enter a value for Row " + (i+1) + " and column " + (j+1) +": ");
                    a[i][j] = input.nextInt();
                } 
            }  

            // Take in values for Matrix B
            out.println("Array B data input:");
            for(int i = 0; i < b.length; i++) 
            {
                for(int j =0; j < b[0].length; j++)
                {
                    out.print("Please enter a value for Row " + (i+1) + " and column " + (j+1) +": ");
                    b[i][j] = input.nextInt();
                } 
            }  
                
            // Give answer to AB
            out.println("AB = ");
            for(int i = 0; i < a.length; i++) 
            {
                System.out.print("[");
                for(int j =0; j < b[0].length; j++)
                {
                    System.out.print(MatrixMult.mult(a,b)[i][j] + ","); //returns matrix C, but you need to tell it which element to print
                                                      //of the matrix, hence the [i][j] after it returns C (.mult(a,b))
                }    
                System.out.println("]"); 
            } 
        }
        if (columnB != rowA) 
        {
            out.println("Sorry the number of columns in Matrix B \ndoes not equal the number of rows in Matrix A.");
            out.println("So, BA is undefined.");
        }
        else
        {
            out.println("BA = ");
            for(int i = 0; i < b.length; i++) 
            {
                System.out.print("[");
                for(int j =0; j < a[0].length; j++)
                {
                    System.out.print(MatrixMult.mult(b,a)[i][j] + ","); //returns matrix C, but you need to tell it which element to print
                                                      //of the matrix, hence the [i][j] after it returns C (.mult(a,b))
                }   
                System.out.println("]");
            }
        }   
    }
}
