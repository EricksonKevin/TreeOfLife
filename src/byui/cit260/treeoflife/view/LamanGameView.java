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
public class LamanGameView extends View{

    public LamanGameView() {
        super("\n"
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
            + "\n---------------------------------------");
    }
        
    
@Override
    public void doAction(Object obj) {
        
        String value  = (String)obj;
        
        char choice = value.charAt(0);
        
        switch (choice){
            
            case 'C': //continue game
                 this.console.println("\nLets move on with the game");
                break;  
            case 'Q': //Quit help menu
                return;
            default:
                this.console.println("\n***Invalid selection *** Try again");
                break;
                
               
        }
    }
    
}
