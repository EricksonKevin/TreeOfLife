/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeoflife.view;

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
        
        //Create and save player object
        
        //Display personalized welcome message
        
        //Display the Main menu

}

    private void displayBanner() {
        System.out.println("\n\n*********************************************");
        
        System.out.println("*                                           *"
                + "\n* This is game is THE TREE OF LIFE.         *"
                + "\n* In this game you will need to put on the  *"
                + "\n* whole armor of God and follow the path to *"
                + "\n* the Tree of Life.");
        
         System.out.println("*                                           *"
                + "\n* You will need to increase your rank in    *"
                + "\n* four seperate categories.                 *"
                + "\n* Faith, Righteousness, Salvation and Spirit*" 
                + "\n* You will be able to increase your         *"
                + "\n* individual ranks as you correctly         *"
                + "\n* answer gospel based questions or through  *"
                + "\n* repantance.  As you come closer God and   *"
                + "\n* increase in these four areas, you will    *"
                + "\n* find yourself at THE TREE OF LIFE         *");
         
          System.out.println("*                                           *"
                + "\n* Hold fast to the iron rod and you will    *"
                + "\n* be able to endure this adventure          *");
        System.out.println("\n\n*********************************************");
                 
    }
}   