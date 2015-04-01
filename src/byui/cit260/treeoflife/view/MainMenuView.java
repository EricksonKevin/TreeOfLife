/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeoflife.view;

import byui.cit260.treeoflife.control.GameControl;
import byui.cit260.treeoflife.control.MapControl;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import kevinjoshtreeoflife.KevinJoshTreeOfLife;

/**
 *
 * @author Erickson
 */

public class MainMenuView extends View {
    
    public MainMenuView() {
        super("\n"
            + "\n---------------------------------------"
            + "\n| Main Menu                           |"
            + "\n---------------------------------------"
            + "\nN - Start new game"
            + "\nG - Get and start a saved game"
            + "\nH - Get help on how to play game"
            + "\nS - Save game"
            + "\nE - Exit"
            + "\n---------------------------------------");
    }  
    
    @Override
    public void doAction(Object obj) {
        
        String value  = (String)obj;
        
         String choice = value;
        switch (choice){
            case "N":  
                this.startNewGame();
                break;
            case "G": //get and start an existing game
                this.startExistingGame();
                break;
            case "H": //display the help menu
                this.displayHelpMenu();
                break;
            case "S": //save the current game
                this.saveGame();
                break;  
            case "E": //exit the program
                return ;
                
            default:
                this.console.println("\n***Invalid selection *** Try again");
                break;
                
               
        }
    }

    private void startNewGame() {
        //create new game
      GameControl.createNewGame(KevinJoshTreeOfLife.getPlayer());
      
      //display the game menu
      GameMenuView gameMenu = new GameMenuView();
      gameMenu.display();
    }

    private void startExistingGame() {
        
        System.out.println("\n\nEnter the file path for file where the game "
                           + "is saved.");
        
        String filePath = this.getInput();
        
        try {
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
       // show help menu
     HelpMenuView helpMenu = new HelpMenuView();
     helpMenu.display();
     
    }

    private void saveGame() {
         System.out.println("\n\nEnter the file path for where the game "
                           + "is to be saved.");
         String filePath = this.getInput();
         
         try{
             GameControl.saveGame(KevinJoshTreeOfLife.getCurrentGame(),filePath);
             
         }catch (Exception ex) {
             ErrorView.display("MainMenuView", ex.getMessage());
         }
    }
}
