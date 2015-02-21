/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeoflife.control;

import byui.cit260.treeoflife.model.Player;
import kevinjoshtreeoflife.KevinJoshTreeOfLife;

/**
 *
 * @author Nexeus
 */
public class ProgramControl {

    public static Player createPlayer(String playerName) {
        if (playerName == null) {
        return null;
        }
        
        Player player = new Player();
        player.setPlayerName(playerName);
        
        KevinJoshTreeOfLife.setPlayer(player); // save the player
        return player;
    }
    
}
