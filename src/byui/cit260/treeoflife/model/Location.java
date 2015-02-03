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
public class Location implements Serializable {
    
   private String ironRodLocation;

    public Location() {
    }
   
   

    public String getIronRodLocation() {
        return ironRodLocation;
    }

    public void setIronRodLocation(String ironRodLocation) {
        this.ironRodLocation = ironRodLocation;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.ironRodLocation);
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
        if (!Objects.equals(this.ironRodLocation, other.ironRodLocation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "ironRodLocation=" + ironRodLocation + '}';
    }
   
   
}
