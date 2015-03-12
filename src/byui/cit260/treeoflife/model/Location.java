/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treeoflife.model;

import java.io.Serializable;
/**
 *
 * @author Erickson
 */
public class Location implements Serializable{
 
    private double rowCount;
    private double columnCount;
    
    private Map map;

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Question[] getQuestion() {
        return question;
    }

    public void setQuestion(Question[] question) {
        this.question = question;
    }
    private Scene scene;
    private Question [] question;
    
    

    public Location() {
    }
    
    

    public double getRowCount() {
        return rowCount;
    }

    public void setRowCount(double rowCount) {
        this.rowCount = rowCount;
    }

    public double getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(double columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
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
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.rowCount) != Double.doubleToLongBits(other.rowCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columnCount) != Double.doubleToLongBits(other.columnCount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }
    
    
}
