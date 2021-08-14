/*
 * A program that randomly generates fake geneology data for a dog.
 */
package sourcepackage.week1.Assessments;

import java.util.Scanner;

/**
 *
 * @author Sean McNally
 */
public class DogGenetics{
    
    //Generates a random integer in a given range.
    static int getRandomNumber(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }
    
    public static void main(String args[]){
        String name;           //Dog name
        int percentLeft = 100; //Percent remaining to pull from
        int currentPercent;    //Percent of current breed
        
        Scanner scanner = new Scanner(System.in); //Scanner for user input
        
        //Prompts user for dog name.
        System.out.println("What is your dog's name?");
        name = scanner.nextLine();
        
        //Starts heritage feedback.
        System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.\n\n"
                         + name + " is:\n");
        
        //Repeatedly generates a random percent in the remaining range, then 
        //updates said range. Displays result as heritage.
        currentPercent = getRandomNumber(0 , percentLeft);
        percentLeft -= currentPercent;
        System.out.println(currentPercent + "% St. Bernard");
        
        currentPercent = getRandomNumber(0 , percentLeft);
        percentLeft -= currentPercent;
        System.out.println(currentPercent + "% Chihuahua");
        
        currentPercent = getRandomNumber(0 , percentLeft);
        percentLeft -= currentPercent;
        System.out.println(currentPercent + "% Dramatic RedNosed Asian Pug");
        
        currentPercent = getRandomNumber(0 , percentLeft);
        percentLeft -= currentPercent;
        System.out.println(currentPercent + "% Common Cur");
        
        //Displays remaining percent as final heritage.
        System.out.println(percentLeft + "% King Doberman");
        
        //Finishes feedback.
        System.out.println("\nWow, that's QUITE the dog!");
    }
}
