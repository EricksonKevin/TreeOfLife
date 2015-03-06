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
public abstract class View implements ViewInterface {
    
    public String promptMessage;

    public View(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
    @Override
    public void display() {
       
        char selection = ' ';
        do {
            System.out.println(promptMessage);  //display the main menu
            
            String input = this.getInput(); // get the users selection
            selection = input.charAt(0); //get first character of string
            
            this.doAction(selection); //do action based on selection
            
        } while (selection != 'E'); // a selection is not "Exit"
    }
    
    @Override
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
                
                break; // out of the (exit) the repetition
            }
         return choice;  //return the name
}
}