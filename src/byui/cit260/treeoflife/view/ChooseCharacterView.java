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
public class ChooseCharacterView extends View{
    
    public ChooseCharacterView() {
        super("\n"
            + "\n---------------------------------------"
            + "\n| Choose your Character               |"
            + "\n---------------------------------------"
            + "\nN - Nephi"
            + "\nS - Sariah"
            + "\nL - Lamen"           
            + "\nQ - Quit"
            + "\n---------------------------------------");
        
        }
    @Override
    public void doAction(Object obj) {
        
            String value  = (String)obj;
        
        char choice = value.charAt(0);       
        switch (choice){
            case 'N': // Goal of the game
                this.NephiGameView();
                break;
            case 'S': //How to move
                this.SariahGameView();
                break;
            case 'L': //Character Status
                 this.LamenGameView();
                break;       
            case 'Q': //Quit help menu
                 this.MainMenuView();
                return;
            default:
                this.console.println("\n***Invalid selection *** Try again");
                break;
                
               
        }
    
}

    private void NephiGameView() {
        NephiGameView nephiGameMenu = new NephiGameView();
     nephiGameMenu.display(); //To change body of generated methods, choose Tools | Templates.
    }

    private void SariahGameView() {
        SariahGameView sariahGameMenu = new SariahGameView();
     sariahGameMenu.display();
    }

    private void LamenGameView() {
        LamanGameView lamanGameMenu = new LamanGameView();
     lamanGameMenu.display();
    }

    private void MainMenuView() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }

  
    }
