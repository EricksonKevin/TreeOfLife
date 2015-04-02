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
public class HelpMenuView extends View{

    
        public HelpMenuView() {
        super("\n"
            + "\n---------------------------------------"
            + "\n| Help Menu                           |"
            + "\n---------------------------------------"
            + "\nG - What is the goal of the game?"
            + "\nM - How to move"
            + "\nP - Character Status"
            + "\nA - Obtain armor"
            + "\nQ - Quit"
            + "\n---------------------------------------");
        
        }
    @Override
    public void doAction(Object obj) {
        
            String value  = (String)obj;
        
        char choice = value.charAt(0);       
        switch (choice){
            case 'G': // Goal of the game
                this.console.println("\nIncrease your rank status in Faith, Righteousness, Spirit, and Salvation to reach the Tree of Life");
                break;
            case 'M': //How to move
                this.console.println("\n***Invalid selection *** Try again");
                break;
            case 'P': //Character Status
                 this.rankStatusView();
                break;
            case 'A': //Obtain Armor
                 this.console.println("\n***Invalid selection *** Try again");
                break;  
            case 'Q': //Wuit help menu
                this.MainMenuView();
                return;
            default:
                this.console.println("\n***Invalid selection *** Try again");
                break;
                
               
        }
    }

  

    private void rankStatusView() {
        RankStatusView rankStatusMenu = new RankStatusView();
     rankStatusMenu.display(); //To change body of generated methods, choose Tools | Templates.
    }

    private void MainMenuView() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }

   
}
