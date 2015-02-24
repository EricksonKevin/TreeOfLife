/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeoflife.view;

import java.util.Scanner;

/**
 *
 * @author Nexeus
 */
public class LamanGameView {

    public final String MENU = "\n"
            + "\n---------------------------------------"
            + "\n Hello Lamen, It is your privilege to  "
            + "\n see your father's dream fulfilled.    "
            + "\n Hold to the rod of iron and find your "
            + "\n way to the tree of life.  Build your  "
            + "\n faith and gain an understanding of the"
            + "\n gospel.  "
            + "\n---------------------------------------"                             
            + "\nC - Continue"
            + "\nQ - Quit    "
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
            
            case 'C': //continue game
                 System.out.println("\nLets move on with the game");
                break;  
            case 'Q': //Quit help menu
                return;
            default:
                System.out.println("\n***Invalid selection *** Try again");
                break;
                
               
        }
    }
    
}
