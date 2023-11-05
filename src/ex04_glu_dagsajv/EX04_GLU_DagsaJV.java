package ex04_glu_dagsajv;

import java.util.Scanner;

// EX04_GLU_DagsaJV

// Written by Jayden Dagsa.
// Partly written by CS4 teachers.

// Licensed under the terms of the MIT License.

/*
Copyright 2023, Jayden Riley V. Dagsa and PSHS-MC Computer Science 4 Teachers
    
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the “Software”), to deal 
in the Software without restriction, including without limitation the rights 
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell 
copies of the Software, and to permit persons to whom the Software is furnished 
to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all 
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, 
INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF 
CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE 
OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

public class EX04_GLU_DagsaJV{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	Move rock = new Move("Rock");
	Move paper = new Move("Paper");
	Move scissors = new Move("Scissors");
        Move player = new Move("Player");
        Move computer = new Move("Computer");
		
	rock.setStrongAgainst(scissors);
	paper.setStrongAgainst(rock);
        scissors.setStrongAgainst(paper);
		
	int rounds = 2;
        boolean gameProgress = false;
        int playerPt = 0;
        int machinePt = 0;
        
        // application loop, only exit upon user instruction
        while (true) {
            // pregame
            while(gameProgress != true) {
                // greet
                System.out.print("Welcome to Rock, Paper, Scissors! Please choose an option [1-3]:\n1. Start game\n2. Change number of rounds\n3. Exit application\n> ");
                
                // set input
                int playerInput = sc.nextInt();
                
                // validate
                while (playerInput < 1 || playerInput > 3) {
                    System.out.print("\nInvalid input. Please try again.");
                    
                    System.out.print("\nWelcome to Rock, Paper, Scissors! Please choose an option [1-3]:\n1. Start game\n2. Change number of rounds\n3. Exit application\n> ");
                    playerInput = sc.nextInt();
                }
                
                // valid input, switch case
                switch (playerInput) {
                    case 1 -> gameProgress = true;
                    case 2 -> {
                        System.out.print("\nHow many rounds do you need to win a match? ");
                        rounds = sc.nextInt();
                        System.out.println("\nSetting saved.\n");
                    }
                    case 3 -> {
                        System.out.println("\nThank you for playing! The app will now exit.");
                        System.exit(0);
                    }
                }
            }

            // game
            System.out.println("\nYou need " + rounds + " " + (rounds == 1 ? "round" : "rounds") + " to win this match.");
            
            // per-round loop, ends once either side has won needed amt. of rounds
            while ((playerPt != rounds && machinePt < rounds) || (machinePt != rounds && playerPt < rounds)) {

                // random move
                int random = (int) Math.floor(Math.random()*3) + 1;
                
                // switch case
                switch (random) {
                    case 1 -> { computer = rock; break; }
                    case 2 -> { computer = paper; break; }
                    case 3 -> { computer = scissors; break; }
                }
                            
                // ask for input
                System.out.print("\nThe computer has made its move. Select yours [1-3]:\n1. Rock\n2. Paper\n3. Scissors\n> ");
                
                // set input
                int playerInput = sc.nextInt();
                
                // validate input
                while (playerInput < 1 || playerInput > 3) {
                    System.out.print("\nInvalid input. Please try again.");
                    
                    System.out.print("\nThe computer has made its move. Select yours [1-3]:\n1. Rock\n2. Paper\n3. Scissors\n> ");
                    playerInput = sc.nextInt();
                }
                    
                // valid input, switch case
                switch (playerInput) {
                    case 1 -> { player = rock; break; }
                    case 2 -> { player = paper; break; }
                    case 3 -> { player = scissors; break; }
                }

                // switch case Move.compareMoves()
                switch (Move.compareMoves(player, computer)) {
                    case 0 -> {
                        playerPt++;
                        System.out.println("\nPlayer chose " + player.getName() + ". Computer chose " + computer.getName() + ". Player wins round!");
                        break;
                    }
                    case 1 -> {
                        machinePt++;
                        System.out.println("\nPlayer chose " + player.getName() + ". Computer chose " + computer.getName() + ". Computer wins round!");
                        break;
                    }
                    case 2 -> {
                        System.out.println("\nPlayer chose " + player.getName() + ". Computer chose " + computer.getName() + ". The round is tied!");
                        break;
                    }
                }

                // output score
                System.out.println("Player: " + playerPt + " - Computer: " + machinePt);
            }

            // game end
            gameProgress = false;

            // output result
            System.out.println("\n" + ((playerPt > machinePt) ? "Player" : "Computer") + " wins!\n");
        }
        
    }
}