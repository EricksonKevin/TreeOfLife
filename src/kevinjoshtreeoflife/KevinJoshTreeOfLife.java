/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kevinjoshtreeoflife;

import byui.cit260.treeoflife.model.Game;
import byui.cit260.treeoflife.model.Map;
import byui.cit260.treeoflife.model.Player;
import byui.cit260.treeoflife.model.Character;
import byui.cit260.treeoflife.model.Location;
import byui.cit260.treeoflife.model.Ranking;
/**
 *
 * @author Erickson
 */
public class KevinJoshTreeOfLife {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Location area = new Location(); 
     
      area.setRowCount(7);
      area.setColumnCount(8);
      
      String rankingInfo = area.toString();
      System.out.println(rankingInfo);
      
    }
    }     
      
      
      
      
      
      
      
      
      
      
    
    

