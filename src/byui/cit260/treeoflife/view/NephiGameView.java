/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeoflife.view;

import byui.cit260.treeoflife.control.GameControl;
import java.util.Scanner;
import kevinjoshtreeoflife.KevinJoshTreeOfLife;

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
            + "\nR - Repent                             "    
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
        this.BeginNephiQuestionView();
                break;  
                case 'R': // Continue Game
        this.RepentView();
                break;
                case 'P': // print rank report
        this.startRankReportView();
                break;
            case 'Q': //Quit help menu
                this.MainMenuView();
                return;
            default:
                this.console.println("\n***Invalid selection *** Try again");
                break;
                
               
        }
    }

    private void BeginNephiQuestionView() {
        BeginNephiQuestionView beginNephiQuestionMenu = new BeginNephiQuestionView();
     beginNephiQuestionMenu.display(); //To change body of generated methods, choose Tools | Templates.
    }

    private void MainMenuView() {
       MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }

    private void startRankReportView() {
        this.console.println("\n\nEnter the file path for where the rank "
                           + "report is to be saved.");
         String filePath = this.getInput();
         
         try{
             GameControl.RankReport(KevinJoshTreeOfLife.getRankReport(),filePath);
             
         }catch (Exception ex) {
             ErrorView.display("MainMenuView", ex.getMessage());
         }
    }

    private void RepentView() {
        RepentView repentView = new RepentView();
        repentView.display();
    }

    
    

    

    

   
    }
    

