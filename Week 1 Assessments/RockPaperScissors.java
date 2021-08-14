/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sourcepackage.week1.Assessments;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author SeanM
 */
public class RockPaperScissors {
    public static void main(String args[]){
        int rounds = 0;
        int user = 0;
        int cpu;
        String replay = "";
        String cpuString = "";
        boolean playing = true;
        
        Scanner scanner = new Scanner(System.in);
        Random rng = new Random();
        
        System.out.println("Let's play Rock, Paper, Scissors!");
        
        while(playing){
            
            boolean roundsResponse = false;
            while(!roundsResponse){
                System.out.println("\nHow many rounds would you like to play? (1-10 rounds)");
                try{
                    rounds = Integer.parseInt(scanner.nextLine());
                }catch(Exception e){
                    System.out.println("Input must be an integer.\n");
                    continue;
                }
                if(rounds < 1 || rounds > 10){
                    System.out.println("Number must be from 1 to 10.\n");                    
                }else{
                    roundsResponse = true;
                }
            }
            
            while(rounds != 0){
                
                boolean choiceResponse = false;
                while(!choiceResponse){
                    System.out.println("\nChoose rock, paper, or scissors.\n"
                                     + "1: rock\n"
                                     + "2: paper\n"
                                     + "3: scissors");
                    try{
                        user = Integer.parseInt(scanner.nextLine());
                    }catch(Exception e){
                        System.out.println("Input must be an integer.");
                        continue;
                    }
                    if(user < 1 || user > 3){
                        System.out.println("Number must be from 1 to 3.");                        
                    }else{
                        choiceResponse = true;                    
                    }
                }
                
                
                cpu = rng.nextInt(3) + 1;
                
                switch(cpu){
                    case 1:
                        cpuString = "rock";
                        break;
                    case 2:
                        cpuString = "paper";
                        break;
                    case 3:
                        cpuString = "scissors";
                        break;
                }
                
                System.out.println("\nComputer chose " + cpuString + ".");

                switch((user-cpu+3)%3){
                    case 0:
                        System.out.println("It's a tie.");
                        break;
                    case 1:
                        System.out.println("You win!");
                        break;
                    case 2:
                        System.out.println("Computer wins.");
                        break;
                }
                
                rounds--;
            }
            
            boolean replayResponse = false;
            while(!replayResponse){
                System.out.println("\nPlay again? (Y/N)");
                replay = scanner.nextLine();
                replay = replay.toLowerCase();
                
                if(!replay.equals("y") && !replay.equals("n")){
                    System.out.println("\nPlease choose y or n.");
                }else{
                    replayResponse = true;
                }
            }
            
            if(replay.equals("n")){
                playing = false;
            }
        }
        
        System.out.println("\nThanks for playing!");
    }
}
