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

import byui.cit260.treeoflife.view.StartProgramView;

/**
 * 
 *
 * @author Erickson
 */
public class KevinJoshTreeOfLife {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args){
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram();  
    }
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        KevinJoshTreeOfLife.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        KevinJoshTreeOfLife.player = player;
    }

    /**
     * @param args the command line arguments
     */
    
          
    
        }   
      
      
      
      
      
      
      
      
      
      
    
    

