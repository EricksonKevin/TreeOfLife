/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeoflife.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Erickson
 */
public enum Character implements Serializable {
  
    Nephi,
    Sariah,
    Lamen;
    
    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Ranking[] getRanking() {
        return ranking;
    }

    public void setRanking(Ranking[] ranking) {
        this.ranking = ranking;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
    private Game game;
    private Player player;
    private Ranking [] ranking;
    private Inventory inventory;
    
    
    
    private final Point coordinates;

     Character() {
        
        coordinates = new Point(1,1);
        
    }

    public Point getCoordinates() {
        return coordinates;
    }

 
    

    
      
}
