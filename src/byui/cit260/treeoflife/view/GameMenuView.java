/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeoflife.view;

import java.util.Scanner;

/**
 *
 * @author Erickson
 */
public class GameMenuView {

        public final String MENU = "\n"
            + "\n---------------------------------------"
            + "\n| Character Selection                           |"
            + "\n---------------------------------------"
            + "\nN - Nephi"
            + "\nS - Sariah"
            + "\nL - Laman"
            + "\nQ - Quit"
            + "\n---------------------------------------";
        
    void displayMenu() {
        
        char selection = ' ';
        do {
            System.out.println(MENU);  //display the main menu
            
            String input = this.getInput(); // get the users selection
            selection = input.charAt(0); //get first character of string
            
            this.doAction(selection); //do action based on selection
            
        } while (selection != 'Q'); // a selection is not "Exit"
    }

    private String getInput() {
       Boolean valid = false; //indicate if the name has been retrieved
            String choice = null;
            Scanner keyboard = new Scanner(System.in);//keyboard input stream
            
            while(!valid){//while a valid selection has not been retrieved
                //prompt for the player's selection
                System.out.println("Select Option");
                // get the selection from the keyboard and trim off the blanks
                choice = keyboard.nextLine();
                choice = choice.trim();
                
                break; // out of the (exit) the repetition
            }
            return choice; // return the selection option
    }

    private void doAction(char choice) {
        
        switch (choice){
            case 'N': // Choose Nephi
                this.startNephiGame();
                break;
            case 'S': //Choose Sariah
                this.startSariahGame();
                break;
            case 'L': //Choose Lamen
                 this.startLamanGame();
                break;
            case 'Q': //Quit help menu
                return;
            default:
                System.out.println("\n***Invalid selection *** Try again");
                break;
                
               
        }
    }

    private void startNephiGame() {
        //display the Nephi menu
      NephiGameView gameMenu = new NephiGameView();
      gameMenu.displayMenu();
    }

    private void startSariahGame() {
        SariahGameView gameMenu = new SariahGameView();
      gameMenu.displayMenu();
    }

    private void startLamanGame() {
        LamanGameView gameMenu = new LamanGameView();
      gameMenu.displayMenu();
    }
        
    }
    

