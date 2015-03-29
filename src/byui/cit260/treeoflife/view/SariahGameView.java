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
public class SariahGameView extends View{

    public SariahGameView() {
        super( "\n"
            + "\n---------------------------------------"
            + "\n Hello Sariah, It is your privilege    "
            + "\n to embark on this journey.  Your      "
            + "\n husband, Lehi, has shared this vision "
            + "\n of the tree of life and its eternal   "
            + "\n meaning.  As you hold to the iron rod "
            + "\n and prove yourself worthy of the fruit"
            + "\n of the tree of life, you will gain    "
            + "\n eternal blessings and exaltation.     "
            + "\n---------------------------------------"
            + "\nB - Begin Game  "
            + "\nP - Print Rank Report                  "
            + "\nQ - Quit                               "
            + "\n---------------------------------------");
    }
@Override
    public void doAction(Object obj) {
        
        String value  = (String)obj;
        
        char choice = value.charAt(0);
        
        switch (choice){
            case 'B': // Continue Game
        this.startBeginQuestionView();
                break; 
                
                case 'P': // print rank report
        this.startRankReportView();
                    
            case 'Q': //Quit help menu
                return;
            default:
                this.console.println("\n***Invalid selection *** Try again");
                break;
                
               
        }
    }

    private void startBeginQuestionView() {
       BeginQuestionView BeginQuestion = new BeginQuestionView();
     BeginQuestion.displayMenu();
    }

    private void startRankReportView() {
        RankReportView RankReport = new RankReportView();
     RankReport.displayMenu(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
