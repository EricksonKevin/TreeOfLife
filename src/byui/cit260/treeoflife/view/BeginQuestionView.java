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
public class BeginQuestionView {
    public final String MENU = "\n"
            + "\n-----------------------------------------"
            + "\n| This is your opportunity to answer    |"
            + "\n| some questions to earn points         |"
            + "\n| towards your armour pieces.           |"
            + "\n| Would you like to test your knowledge?|"
            + "\n-----------------------------------------"
            + "\nY - Test Knowledge                       "           
            + "\nQ - Quit                                 "
            + "\n-----------------------------------------";
        
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
            case 'Y': // Goal of the game
                System.out.println("\nIncrease your rank status in Faith, Righteousness, Spirit, and Salvation to reach the Tree of Life");
                break;
              
            case 'Q': //Wuit help menu
                return;
            default:
                System.out.println("\n***Invalid selection *** Try again");
                break;
                
               
        }
    }
}
