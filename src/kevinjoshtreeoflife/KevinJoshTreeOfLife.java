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
      
    }
    }     
      
      
      
      
      
      
      
      
      
      
    
    

