/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeoflife.model;

import byui.cit260.treeoflife.control.GameControl;
import java.io.Serializable; 
import java.util.Objects;
/**
 *
 * @author Erickson
 */
public class Map implements Serializable {

    private static Scene createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int rowCount;

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }
    private int columnCount;

    public Map(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
    }
    
    
    private Game game;

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    
    private Location [] [] locations;

    public Map(Location[][] locations) {
        this.locations = locations;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    
    

    public Map() {
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
        
        return true;
    }

    private static Map createMap(){
        
        Map map = new Map(20, 20);
        
        Scene scenes = createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
        
    }
    
    
    
    
}
