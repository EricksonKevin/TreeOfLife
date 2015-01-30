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
public class Player implements Serializable {

    private String name;
    private Integer faith;
    private Integer righteousness;
    private Integer salvation;
    private Integer spirit;

    public Player() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFaith() {
        return faith;
    }

    public void setFaith(Integer faith) {
        this.faith = faith;
    }

    public Integer getRighteousness() {
        return righteousness;
    }

    public void setRighteousness(Integer righteousness) {
        this.righteousness = righteousness;
    }

    public Integer getSalvation() {
        return salvation;
    }

    public void setSalvation(Integer salvation) {
        this.salvation = salvation;
    }

    public Integer getSpirit() {
        return spirit;
    }

    public void setSpirit(Integer spirit) {
        this.spirit = spirit;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", faith=" + faith + ", righteousness=" + righteousness + ", salvation=" + salvation + ", spirit=" + spirit + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + Objects.hashCode(this.faith);
        hash = 47 * hash + Objects.hashCode(this.righteousness);
        hash = 47 * hash + Objects.hashCode(this.salvation);
        hash = 47 * hash + Objects.hashCode(this.spirit);
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.faith, other.faith)) {
            return false;
        }
        if (!Objects.equals(this.righteousness, other.righteousness)) {
            return false;
        }
        if (!Objects.equals(this.salvation, other.salvation)) {
            return false;
        }
        if (!Objects.equals(this.spirit, other.spirit)) {
            return false;
        }
        return true;
    }
    
    
                   
}
