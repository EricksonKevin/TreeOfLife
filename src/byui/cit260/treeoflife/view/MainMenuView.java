/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeoflife.view;

import byui.cit260.treeoflife.control.GameControl;
import java.util.Scanner;
import kevinjoshtreeoflife.KevinJoshTreeOfLife;

/**
 *
 * @author Erickson
 */
public class MainMenuView {
    
    private final String MENU = "\n"
            + "\n---------------------------------------"
            + "\n| Main Menu                           |"
            + "\n---------------------------------------"
            + "\nN - Start new game"
            + "\nG - Get and start a saved game"
            + "\nH - Get help on  how to play game"
            + "\nS - Save game"
            + "\nE - Exit"
            + "\n---------------------------------------";
    
    void displayMenu() {
       
        char selection = ' ';
        do {
            System.out.println(MENU);  //display the main menu
            
            String input = this.getInput(); // get the users selection
            selection = input.charAt(0); //get first character of string
            
            this.doAction(selection); //do action based on selection
            
        } while (selection != 'E'); // a selection is not "Exit"
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
            case 'N': // create and start a new game
                this.startNewGame();
                break;
            case 'G': //get and start an existing game
                this.startExistingGame();
                break;
            case 'H': //display the help menu
                this.displayHelpMenu();
                break;
            case 'S': //save the current game
                this.saveGame();
                break;  
            case 'E': //exit the program
                return;
            default:
                System.out.println("\n***Invalid selection *** Try again");
                break;
                
               
        }
    }

    private void startNewGame() {
        //create new game
      GameControl.createNewGame(KevinJoshTreeOfLife.getPlayer());
      
      //display the game menu
      GameMenuView gameMenu = new GameMenuView();
      gameMenu.displayMenu();
    }

    private void startExistingGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayHelpMenu() {
       // show help menu
     HelpMenuView helpMenu = new HelpMenuView();
     helpMenu.displayMenu();
     
    }

    private void saveGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
