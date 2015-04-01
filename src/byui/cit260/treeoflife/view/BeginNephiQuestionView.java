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
public class BeginNephiQuestionView extends View{
            

    public BeginNephiQuestionView() {
        super("\n-----------------------------------------"
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
            + "\n-----------------------------------------");
    }
        
   

    

    @Override
    public void doAction(Object obj) {
        String choice = (String) obj;
        choice = choice.trim();
        
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
                }  //To change body of generated methods, choose Tools | Templates.
    }
    
}
