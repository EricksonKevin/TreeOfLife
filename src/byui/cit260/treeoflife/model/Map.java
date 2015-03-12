/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeoflife.model;

import java.io.Serializable; 
import java.util.Objects;
/**
 *
 * @author Erickson
 */
public class Map implements Serializable {
    
    private String ironRod;
    
    private Game game;

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
    private Location location;
    

    public Map() {
    }
    
    

    public String getIronRod() {
        return ironRod;
    }

    public void setIronRod(String ironRod) {
        this.ironRod = ironRod;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.ironRod);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Map other = (Map) obj;
        if (!Objects.equals(this.ironRod, other.ironRod)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "ironRod=" + ironRod + '}';
    }
    
    
    
    
}
