/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeoflife.view;

import byui.cit260.treeoflife.model.Location;
import byui.cit260.treeoflife.model.Map;
import java.util.Scanner;

/**
 *
 * @author Erickson
 */
public class GameMenuView extends View {

        public GameMenuView() {
        super("\n"
            + "\n---------------------------------------"
            + "\n| Game Menu                            |"
            + "\n---------------------------------------"
            + "\nV - View Map"
            + "\nC - Choose  Character" 
            + "\nI - View Inventory"     
            + "\nM - Move to new location"
            + "\nH - Help"    
            + "\nQ - Quit"
            + "\n---------------------------------------");
        }
    @Override
    public void doAction(Object obj) {
        
        String value  = (String)obj;
        
        char choice = value.charAt(0);
        switch (choice){
            case 'V': // View map
                this.viewMap();
                break;
            case 'C': //Choose Character
                this.ChooseCharacterView();
                break;
            case 'I': // View inventory
                //this.InventoryView();
                break;
            case 'M': //Move to new location
                 this.moveLocation();
                break;
            case 'H': //Help
                 this.HelpMenuView();
                break;    
            case 'Q': //Quit Game
                this.MainMenuView();
                return;
            default:
                this.console.println("\n***Invalid selection *** Try again");
                break;
                
               
        }
    }

    

    private void HelpMenuView() {
        //To change body of generated methods, choose Tools | Templates.
    }

    public void viewMap() {
       
        Map map = new Map();
        
        Location [][] locations = map.getLocations();
       
        this.console.println("Map for The Tree of Life Game");
        
        this.console.println("\n | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 |");
        
        
            for (Location[] row : locations) {
                this.console.println("\n---------------------------------------------------------------------------------------------"+"\n 2");
               
                for (Location[] column: locations) {
                    this.console.println("\n|ety|ety|ety|ety|ety|ety|ety|ety|ety|ety|ety|ety|ety|ety|ety|ety|ety|ety|ety|ety");
                    Location[][] currentLocation = map.getLocations();
                    
                  Location location = new Location();
                  if (location.isVisited()) {
                      MapSymbol symbol = new MapSymbol();
                      
                              }
                  else {
                      this.console.println("??");
                      
                  }
                }
            }
    }


    private void moveLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    private void ChooseCharacterView() {
         ChooseCharacterView chooseCharacterMenu = new ChooseCharacterView();
     chooseCharacterMenu.display();//To change body of generated methods, choose Tools | Templates.
    }

    private void MainMenuView() {
       MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }

    //public void InventoryView() {
        //InventoryView inventoryView = new InventoryView();
       // inventoryView.display();
    //}

   
    private static class MapSymbol {

        public MapSymbol() {
        }
    }
        
    }
    

