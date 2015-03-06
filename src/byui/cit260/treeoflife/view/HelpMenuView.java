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
                System.out.println("\nIncrease your rank status in Faith, Righteousness, Spirit, and Salvation to reach the Tree of Life");
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
