/*
 * A program that plays a user-set number of games of rock, paper, scissors
 * with the user.
 */
package sourcepackage.week1.Assessments;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Sean McNally
 */
public class RockPaperScissors {
    public static void main(String args[]){
        int rounds = 0;          //Number of rounds remaining
        int user = 0;            //User choice
        int cpu;                 //Computer choice
        String cpuString = "";   //Computer choice as a string
        String replay = "";      //Response when asked for a replay
        boolean playing = true;  //Is the user still playing
        
        Scanner scanner = new Scanner(System.in); //Scanner for user input
        Random rng = new Random();                //Random number generator
        
        //Start game
        System.out.println("Let's play Rock, Paper, Scissors!");
        
        while(playing){
            
            //Prompts user for number of rounds and checks for valid input.
            //If input is not valid, informs user and prompts again.
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
            
            //Gameplay
            while(rounds != 0){
                
                //Prompts user for choice and checks for valid input.
                //If input is not valid, informs user and prompts again.
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
                
                //Generates computer choice.
                cpu = rng.nextInt(3) + 1;
                
                //Sets string based on computer choice.
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
                
                //States computer choice.
                System.out.println("\nComputer chose " + cpuString + ".");

                //States game status.
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
            
            //Prompts user for a replay and checks for valid input.
            //If input is not valid, informs user and prompts again.
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
            
            //Ends game if user denies replay.
            if(replay.equals("n")){
                playing = false;
            }
        }
        
        //Thanks user for playing
        System.out.println("\nThanks for playing!");
    }
}
