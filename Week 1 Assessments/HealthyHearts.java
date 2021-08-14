/*
 * A program that displays maximum heart rate and target HR zone from 
 * the user's imputted age.
 */
package sourcepackage.week1.Assessments;

import java.util.Scanner;

/**
 *
 * @author Sean McNally
 */
public class HealthyHearts {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in); //Scanner for user imput
        int max;                                  //User age
        
        //Prompts user for age and calculates maximum heartrate.
        System.out.println("What is your age?");
        max = 220 - Integer.parseInt(scanner.nextLine());
        
        //Displays maximum heartrate.
        System.out.println("Your maxmimum heart rate should be " + max + " beats per minute.");
        //Calculates and displays targer HR zone
        System.out.println("Your target HR zone is " + (int) Math.round(0.5 * max) + " - " + (int) Math.round(0.85 * max) + " beats per minute.");
    }
}
