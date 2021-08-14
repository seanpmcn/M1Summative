/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sourcepackage.week1.Assessments;

import java.util.Scanner;

/**
 *
 * @author SeanM
 */
public class DogGenetics{
    static int getRandomNumber(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }
    
    public static void main(String args[]){
        String name;
        int percentLeft = 100;
        int currentPercent;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is your dog's name?");
        name = scanner.nextLine();
        
        System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.\n\n"
                         + name + " is:\n");
        
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
        
        System.out.println(percentLeft + "% King Doberman");
        
        System.out.println("\nWow, that's QUITE the dog!");
    }
}
