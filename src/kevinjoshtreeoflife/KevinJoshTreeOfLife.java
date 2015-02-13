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

import byui.cit260.treeoflife.control.RankControl;

/**
 * 
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
      (ArmorInfo);
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
        
        //Location Class
        
        Location place = new Location();
        
        place.setRowCount(5);
        place.setColumnCount(6);
        
        String LocationInfo = place.toString();
        System.out.println(LocationInfo);
        
        //Question Class
        
        Question valid = new Question();
        
        valid.setQuestion("How are You?");
        valid.setAnswer("Good");
        valid.setLinkedWith("faith");
        
        String QuestionInfo = valid.toString();
        System.out.println(QuestionInfo);
        
        //RankType Class
        
        RankType build = new RankType();
        
        build.setRanType("Shield");
        build.setRankDescription("Faith");
        build.setThresholdValue(7);
        
        String RankTypeInfo = build.toString();
        System.out.println(RankTypeInfo);
        
        //Ranking Class
        
        Ranking great = new Ranking();
        
        great.setValue(8);
        
        String RankingInfo = great.toString();
        System.out.println(RankingInfo);
        
        //Scene Class
        
        Scene mist = new Scene();
        
        mist.setName("church");
        mist.setType("pray");
        mist.setDescription("help");
        
        String SceneInfo = mist.toString();
        System.out.println(SceneInfo);
        
        
        
            
    }
    }     
      
      
      
      
      
      
      
      
      
      
    
    

