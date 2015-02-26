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
public class BeginNephiQuestionView {
    
    
        
    
    public final String MENU = "\n"
            + "\n-----------------------------------------"
            + "\n| Lehi has asked you and your brothers  |"
            + "\n| to go to Jerusalem to obtain the brass|"
            + "\n| plates from Laben                     |"
            + "\n| How do you react?                     |"
            + "\n-----------------------------------------"
            + "\n- agree                                "           
            + "\n- run                               "
            + "\n- murmur                                 "
            + "\n- question                               "
            + "\n                                         "
            + "\nQ- Quit                                  "
            + "\n-----------------------------------------";
        
    void displayMenu() {
        
        String choice ="";
        do {
            System.out.println(MENU);  //display the main menu
            
            String input = this.getInput(); // get the users selection
            
            
           //this.displayAction(choice); 
            
        } while (choice != "Q"); // a selection is not "Exit"
    }

    public String getInput() {
       Boolean valid = false; //indicate if the name has been retrieved
            String choice = null;
            Scanner keyboard = new Scanner(System.in);//keyboard input stream
            
            while(!valid){//while a valid selection has not been retrieved
                //prompt for the player's selection
                System.out.println("Select Option");
                // get the selection from the keyboard and trim off the blanks
                choice = keyboard.nextLine();
                choice = choice.trim();
                
                {
                if (choice.equals("agree")){
                    System.out.println("Congratulations, you earned 2 faith points.");
                }
                else if (choice.equals("run")){
                    System.out.println("Sorry, you received no points.");                   
                }
                
                else if (choice.equals("murmur")){
                    System.out.println("You received 1 spirit point.");
                }
                else if (choice.equals("question")){
                    System.out.println("You received 1 righteousness point.");
                }
                else {
                    System.out.println("Invalid choice");
                } 
    }
                
                
                break; // out of the (exit) the repetition
            }
            return choice; // return the selection option
    }
    
    
}
