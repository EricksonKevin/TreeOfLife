/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeoflife.view;

import byui.cit260.treeoflife.control.ProgramControl;
import byui.cit260.treeoflife.model.Player;
import java.util.Scanner;

/**
 *
 * @author Erickson
 */
public class StartProgramView {
    

    public StartProgramView() {
}

    public void startProgram(){
        
        //Display the banner screen
        this.displayBanner();
        
        //Prompt the player to enter their name.  Retrieve the name of player
        String PlayerName = this.getPlayerName();
        
        //Create and save player object
        Player player = ProgramControl.createPlayer(PlayerName);
        
        //Display personalized welcome message
        this.displayWelcomeMessage(player);
        
        //Display the Main menu
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.displayMenu();
        
}

    private void displayBanner() {
        System.out.println("\n\n*********************************************");
        
        System.out.println("*                                           *"
                + "\n* This is the game of THE TREE OF LIFE.     *"
                + "\n* In this game you will need to put on the  *"
                + "\n* whole armor of God and follow the path to *"
                + "\n* the Tree of Life.                          ");
        
         System.out.println("*                                           *"
                + "\n* You will need to increase your rank in    *"
                + "\n* four seperate categories.                 *"
                + "\n* Faith, Righteousness, Salvation and Spirit*" 
                + "\n* You will be able to increase your         *"
                + "\n* individual ranks as you correctly         *"
                + "\n* answer gospel based questions or through  *"
                + "\n* repantance.  As you come closer God and   *"
                + "\n* increase in these four areas, you will    *"
                + "\n* find yourself at THE TREE OF LIFE.        *");
         
          System.out.println("*                                           *"
                + "\n* Hold fast to the iron rod and you will    *"
                + "\n* be able to endure all things              *");
        System.out.println("\n\n*********************************************");
                 
    }

    public String getPlayerName() {
            boolean valid = false; //indicate if the name has been retrieved
            String playerName = null;
            Scanner keyboard = new Scanner(System.in);//keyboard input stream
            
            while(!valid){//while a valid name has not been retrieved
                //prompt for the player's name
                System.out.println("Enter your name below:");
                // get the name from the keyboard and trim off the blanks
                playerName = keyboard.nextLine();
                playerName = playerName.trim();
                
                
                // if the name is invalid (less than two characters in length)
                if (playerName.length()< 2) {
                    System.out.println("Invalid name - the name must not be blank");
                    continue; // and repeat again
                }
                break; // out of the (exit) the repetition
            }
            return playerName; // return the name
        }

    private void displayWelcomeMessage(Player player) {
        System.out.println("\n\n=============================================");
        System.out.println("\tWelcome to the game " + player.getPlayerName());
        System.out.println("\tWe hope you have a lot of fun");
        System.out.println("=================================================");
    }
    }

    
        
            
   