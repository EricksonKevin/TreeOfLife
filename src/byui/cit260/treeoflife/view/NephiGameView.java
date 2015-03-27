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
public class NephiGameView extends View {

    
    public NephiGameView() {
        super( "\n"
            + "\n---------------------------------------"
            + "\n Hello Nephi, It is your privilege    "
            + "\n to embark on this journey.  Your      "
            + "\n father, Lehi, has shared this vision "
            + "\n of the tree of life and its eternal   "
            + "\n meaning.  As you hold to the iron rod "
            + "\n and prove yourself worthy of the fruit"
            + "\n of the tree of life, you will gain    "
            + "\n eternal blessings and exaltation.     "
            + "\n---------------------------------------"
            + "\nB - Begin Game                         "
            + "\nQ - Quit                               "
            + "\n---------------------------------------");
    }
    
@Override
    public void doAction(Object obj) {
        
        String value  = (String)obj;
        
        char choice = value.charAt(0);
        
        switch (choice){
            case 'B': // Continue Game
        this.BeginNephiQuestionView();
                break;           
            case 'Q': //Quit help menu
                return;
            default:
                this.console.println("\n***Invalid selection *** Try again");
                break;
                
               
        }
    }

    private void BeginNephiQuestionView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    

   
    }
    

