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
public class HealthyHearts {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int max;
        
        System.out.println("What is your age?");
        max = 220 - Integer.parseInt(scanner.nextLine());
        
        System.out.println("Your maxmimum heart rate should be " + max + " beats per minute.");
        System.out.println("Your target HR zone is " + (int) Math.round(0.5 * max) + " - " + (int) Math.round(0.85 * max) + " beats per minute.");
    }
}
