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
public class HelpMenuView {

    
        public final String MENU = "\n"
            + "\n---------------------------------------"
            + "\n| Help Menu                           |"
            + "\n---------------------------------------"
            + "\nG - What is the goal of the game?"
            + "\nM - How to move"
            + "\nP - Character Status"
            + "\nA - Obtain armor"
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
            case 'G': // Goal of the game
                System.out.println("\n***hi");
                break;
            case 'M': //How to move
                System.out.println("\n***Invalid selection *** Try again");
                break;
            case 'P': //Character Status
                 System.out.println("\n***Invalid selection *** Try again");
                break;
            case 'A': //Obtain Armor
                 System.out.println("\n***Invalid selection *** Try again");
                break;  
            case 'Q': //Wuit help menu
                return;
            default:
                System.out.println("\n***Invalid selection *** Try again");
                break;
                
               
        }
    }
}
