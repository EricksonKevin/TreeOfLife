/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kevinjoshtreeoflife;

import byui.cit260.treeoflife.model.Armor;
import byui.cit260.treeoflife.model.Game;
import byui.cit260.treeoflife.model.Map;
import byui.cit260.treeoflife.model.Player;
import byui.cit260.treeoflife.model.Character;
import byui.cit260.treeoflife.model.Inventory;
import byui.cit260.treeoflife.model.Location;
import byui.cit260.treeoflife.model.Question;
import byui.cit260.treeoflife.model.RankType;
import byui.cit260.treeoflife.model.Ranking;
import byui.cit260.treeoflife.model.Scene;
/**
 *
 * @author Erickson
 */
public class KevinJoshTreeOfLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Armor armorpiece = new Armor(); 
     
      armorpiece.setLevel("Level Four");
      armorpiece.setAttribute("Faith");
      
      String ArmorInfo = armorpiece.toString();
      System.out.println(ArmorInfo);
      // Game Class
    Game move = new Game(); 
     
      move.setProgress("level up");
      
      
      String GameInfo = move.toString();
      System.out.println(GameInfo);
      
      //Map Class
      
      Map spot = new Map();
              
              spot.setIronRod("mist");
              
              String  MapInfo = spot.toString();
              System.out.println(MapInfo);
              
      //  Player Class
              
       Player person = new Player();
       
               person.setPlayerName("Kevin");
               person.setScore(20);
               
               String PlayerInfo = person.toString();
               System.out.println(PlayerInfo);
               
        //Character Class
         
        Character each = new Character();
        
                each.setName("Nephi");
                
                String CharacterInfo = each.toString();
                System.out.println(CharacterInfo);
                
        //Inventory Class
                
        Inventory pieces = new Inventory();
        
        pieces.setInvType("Sword");
        pieces.setNumberinStock(5);
        pieces.setReqAmount(10);
        
        String InventoryInfo = pieces.toString();
        System.out.println(InventoryInfo);
        
              
                
              
              
    }
    }     
      
      
      
      
      
      
      
      
      
      
    
    

