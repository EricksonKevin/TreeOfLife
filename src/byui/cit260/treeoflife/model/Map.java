/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeoflife.model;

import byui.cit260.treeoflife.control.GameControl;
import java.io.Serializable; 
import java.util.Objects;
import kevinjoshtreeoflife.KevinJoshTreeOfLife;
/**
 *
 * @author Erickson
 */
public class Map implements Serializable {
    
    

    private static Scene createScenes() {
    
    Game game = KevinJoshTreeOfLife.getCurrentGame();
    
    Scene[] scenes = new Scene[SceneType.values().length];
    
    Scene startingScene = new Scene();
    startingScene.setDescription(
            "\nAnd we did come to the land which was called Bountiful, "
           + "because of its much fruit and also wild honey; and all   "
           +"these things were prepared of the Lord that we might not  "
           +"perish. And we beheld the sea, which we called Irreantum, "
           +"which, being interpreted, is many waters");
    startingScene.setMapSymbol(" ST ");
    startingScene.setBlocked(false);
    startingScene.setTravelTime(240);
    
    scenes[SceneType.start.ordinal()] = startingScene;
    
    
    Scene finishScene = new Scene();
    finishScene.setDescription(
             "\nCongratulations! Well done though good and faithful servant."
            +"You have just launched your ship of curious workmanship and   "
            +"\nbegun your journey to the promised land." );
    finishScene.setMapSymbol(" FN ");
    finishScene.setBlocked(false);
    finishScene.setTravelTime(Double.POSITIVE_INFINITY);
    
    scenes[SceneType.finish.ordinal()] = finishScene;
        return null;
    
     }
    public enum SceneType{
        start,
        angel,
        desert,
        water,
        river,
        temple,
        finish,
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations [0][0].setScene(scenes[SceneType.desert.ordinal()]);
        locations [0][1].setScene(scenes[SceneType.desert.ordinal()]);
        locations [0][2].setScene(scenes[SceneType.start.ordinal()]);
        locations [0][3].setScene(scenes[SceneType.angel.ordinal()]);
        locations [0][4].setScene(scenes[SceneType.water.ordinal()]);
        locations [0][5].setScene(scenes[SceneType.river.ordinal()]);
        locations [0][6].setScene(scenes[SceneType.temple.ordinal()]);
        locations [0][7].setScene(scenes[SceneType.finish.ordinal()]);
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
  
    public Map(int rowCount, int columnCount){
    
      if (rowCount < 1 || columnCount < 1){
          System.out.println("The number of rows and columns must be > zero");
          return;
      }
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        
        this.locations = new Location [rowCount] [columnCount];
        
        for (int row = 0; row < rowCount; row++) {
            for(int column = 0; column < columnCount; column++) {
            
            Location location = new Location();
            location.setColumn(column);
            location.setRow(row);
            
            
            locations[row][column] = location;
            }
        }
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
