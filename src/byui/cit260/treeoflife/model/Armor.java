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
 * @author Nexeus
 */
public class Armor implements Serializable{
    
    private String level;
    private String attribute;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Armor() {
    }

    @Override
    public String toString() {
        return "Armor{" + "level=" + level + ", attribute=" + attribute + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.level);
        hash = 37 * hash + Objects.hashCode(this.attribute);
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
        final Armor other = (Armor) obj;
        if (!Objects.equals(this.level, other.level)) {
            return false;
        }
        if (!Objects.equals(this.attribute, other.attribute)) {
            return false;
        }
        return true;
    }
    
    
}
