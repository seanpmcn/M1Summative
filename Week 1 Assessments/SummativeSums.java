/*
 * A program that displays the sums of arrays of integers.
 */
package sourcepackage.week1.Assessments;

/**
 *
 * @author Sean McNally
 */
public class SummativeSums {
    
    //Calculates sum from an array of integers.
    static int sums(int nums[]){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }
    
    public static void main(String args[]){
        //Integer arrays
        int[] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] array2 = { 999, -60, -77, 14, 160, 301 };
        int[] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };
        
        //Print statements
        System.out.println("#1 Array Sum: " + sums(array1));
        System.out.println("#2 Array Sum: " + sums(array2));
        System.out.println("#3 Array Sum: " + sums(array3));
    }
}
