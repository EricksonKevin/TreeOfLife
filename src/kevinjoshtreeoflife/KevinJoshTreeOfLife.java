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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 *
 * @author Erickson
 */
public class KevinJoshTreeOfLife {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    
    public static void main(String[] args){
        
        try {
            
            KevinJoshTreeOfLife. inFile=
                    new BufferedReader(new InputStreamReader(System.in));
            
            KevinJoshTreeOfLife.outFile = new PrintWriter(System.out, true);
            
            //open log file
            String filePath = "log.txt";
            KevinJoshTreeOfLife.logFile = new PrintWriter(filePath);
            
            StartProgramView startProgramView = new StartProgramView();
        startProgramView.startProgram(); 
            
        } catch (Exception e){
                System.out.println("Exception: " + e.toString() +
                                   "\nCause: " + e.getCause() +
                                   "\nMessage: " + e.getMessage());
             
        
        }
        
        finally {
            try {
                if (KevinJoshTreeOfLife.inFile != null)
                    KevinJoshTreeOfLife.inFile.close();
                
                if (KevinJoshTreeOfLife.outFile != null)
                    KevinJoshTreeOfLife.outFile.close();
                
                if (KevinJoshTreeOfLife.logFile != null)
                    KevinJoshTreeOfLife.outFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
                
            }
            KevinJoshTreeOfLife.outFile.close();
            
          
            
        
            
        
        
    }
        
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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        KevinJoshTreeOfLife.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        KevinJoshTreeOfLife.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        KevinJoshTreeOfLife.logFile = logFile;
    }
    
    //public static PrintWriter getOutFile() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    public static Game getRankReport() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }



    
    /**
     * @param args the command line arguments
     */
    
          
    
         
      
      
      
      
      
      
      
      
      
      
    
    

