/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeoflife.control;


import byui.cit260.treeoflife.exceptions.GameControlException;
import byui.cit260.treeoflife.model.Game;
import byui.cit260.treeoflife.model.Map;
import byui.cit260.treeoflife.model.Player;
import byui.cit260.treeoflife.model.Scene;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import kevinjoshtreeoflife.KevinJoshTreeOfLife;

/**
 *
 * @author Erickson
 */
public class GameControl {
    private static String filepath;
    private static Object game;

    public static void createNewGame(Player player)  {
        
        Game game = new Game();
        KevinJoshTreeOfLife.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        /*Character character = new Character();
        game.setCharacter(character);*/
        
        MapControl.moveCharactersToStartingLocation(map);
        
        
      
        
        
        
        
        
        
    }

    public static void assignScenesToLocations(Map map, Scene scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void saveGame(Game currentGame, String filePath) 
         throws GameControlException {
        
        
        try ( FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);
        }
        catch(IOException e){
            throw new GameControlException(e.getMessage());
            
                
    }
    }

    public static void getSavedGame(String filePath) 
                        throws GameControlException {
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream output = new ObjectInputStream(fips);
            
            game = (Game) output.readObject();
        }
        catch (FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
            
        }
        KevinJoshTreeOfLife.setCurrentGame(game);
    }

    public static void RankReport(Game currentGame, String filePath) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
    

