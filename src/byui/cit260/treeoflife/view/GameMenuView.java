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
public class GameMenuView extends View {

        public GameMenuView() {
        super("\n"
            + "\n---------------------------------------"
            + "\n| Character Selection                           |"
            + "\n---------------------------------------"
            + "\nN - Nephi"
            + "\nS - Sariah"
            + "\nL - Laman"
            + "\nQ - Quit"
            + "\n---------------------------------------");
        }
    @Override
    public void doAction(Object obj) {
        
        String value  = (String)obj;
        
        char choice = value.charAt(0);
        switch (choice){
            case 'N': // Choose Nephi
                this.startNephiGame();
                break;
            case 'S': //Choose Sariah
                this.startSariahGame();
                break;
            case 'L': //Choose Lamen
                 this.startLamanGame();
                break;
            case 'Q': //Quit help menu
                return;
            default:
                System.out.println("\n***Invalid selection *** Try again");
                break;
                
               
        }
    }

    private void startNephiGame() {
        //display the Nephi menu
      NephiGameView gameMenu = new NephiGameView();
      gameMenu.displayMenu();
    }

    private void startSariahGame() {
        SariahGameView gameMenu = new SariahGameView();
      gameMenu.displayMenu();
    }

    private void startLamanGame() {
        LamanGameView gameMenu = new LamanGameView();
      gameMenu.displayMenu();
    }
        
    }
    

