/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeoflife.view;

import byui.cit260.treeoflife.control.GameControl;
import kevinjoshtreeoflife.KevinJoshTreeOfLife;

/**
 *
 * @author Erickson
 */
public class RepentView extends View {
    public RepentView() {
        super("\n"
            + "\n---------------------------------------"
            + "\n| The Lord is pleased with your       |"
            + "\n| decision to repent, and He knows    |"
            + "\n| that you will find happiness in     |"
            + "\n| your choice to follow the Lord.     |"
            + "\n|                                     |"
            + "\n| Yea, I would declare unto every     |"
            + "\n| soul, as with the voice of thunder, |"
            + "\n| repentance and the plan of          |"
            + "\n| redemption, that they should repent |"
            + "\n| and come unto our God, that there   |"
            + "\n| might not be more sorrow upon all   |"
            + "\n| the face of the earth.              |"
            + "\n|     Alma 29:2                       |"
            + "\n|                                     |"
            + "\n|Please take a moment to ponder your  |"
            + "\n|transgression, and fully commit      |"
            + "\n|yourself to this repentance process. |"
            + "\n---------------------------------------"
            + "\nS - Repent for Salvation points"
            + "\nF - Repent for Faith points"
            + "\nP - Repent for Spirit points"
            + "\nR - Repent for Righteousness points"
            + "\nE - Exit"
            + "\n---------------------------------------");
    }  
    
    @Override
    public void doAction(Object obj) {
        
        String value  = (String)obj;
        
        char choice = value.charAt(0);
        switch (choice){
            case 'S': // Repent for Salvation points
                this.console.println("\n*You earned 1 Salvation point*");
                break;
            case 'F': // Repent for Faith points
                this.console.println("\n*You earned 1 Faith point*");
                break;
            case 'P': // Repent for Spirit points
                this.console.println("\n*You earned 1 Spirit point*");
                break;
            case 'R': // Repent for Righteousness points
                this.console.println("\n*You earned 1 Righteousness point*");
                break;  
            case 'E': //exit the program
                this.MainMenuView();
                return ;
                
            default:
                this.console.println("\n***Invalid selection *** Try again");
                break;
                
               
        }
    }

    private void MainMenuView() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }
}

   
