/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeoflife.view;

/**
 *
 * @author Nexeus
 */
public class BeginLamanQuestionView extends View{
   
    public BeginLamanQuestionView() {
        super("\n"
            + "\n-----------------------------------------"
            + "\n| Lehi has asked you and your brothers  |"
            + "\n| to go to Jerusalem to obtain the brass|"
            + "\n| plates from Laben                     |"
            + "\n| How do you react?                     |"
            + "\n-----------------------------------------"
            + "\nA- agree                                 "           
            + "\nP- Protest loudly                        "
            + "\nM- murmur                                "
            + "\nS- sulk                                  "
            + "\n                                         "
            + "\nQ- Quit                                  "
            + "\n-----------------------------------------");
    }
    @Override
    public void doAction(Object obj) {
        
        String value  = (String)obj;
        
        char choice = value.charAt(0);
        switch (choice){
            case 'A': // Repent for Salvation points
                this.console.println("Congratulations, you earned 2 faith points.");
                break;
            case 'P': // Repent for Faith points
                this.console.println("Sorry, you received no points.");
                break;
            case 'M': // Repent for Spirit points
                this.console.println("You received 1 spirit point.");
                break;
            case 'S': // Repent for Righteousness points
                this.console.println("You received 1 righteousness point.");
                break;  
            case 'Q': //exit the program
                return ;
                
            default:
                this.console.println("\n***Invalid selection *** Try again");
                break;
                
               
        }
    }
}
    
