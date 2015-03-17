/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeoflife.control;


import byui.cit260.treeoflife.model.Game;
import byui.cit260.treeoflife.model.Map;
import byui.cit260.treeoflife.model.Player;
import byui.cit260.treeoflife.model.Scene;
import kevinjoshtreeoflife.KevinJoshTreeOfLife;

/**
 *
 * @author Erickson
 */
public class GameControl {

    public static void createNewGame(Player player)  {
        
        Game game = new Game();
        KevinJoshTreeOfLife.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        /*Character character = new Character();
        game.setCharacter(character);*/
        
        MapControl.moveActorsToStartingLocation(map);
        
        
      
        
        
        
        
        
        
    }

    public static void assignScenesToLocations(Map map, Scene scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
