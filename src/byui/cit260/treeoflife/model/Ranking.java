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
public class Ranking implements Serializable {
    
    private double value;
    
    private Character character;

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public RankType[] getRanktype() {
        return ranktype;
    }

    public void setRanktype(RankType[] ranktype) {
        this.ranktype = ranktype;
    }
    private RankType [] ranktype;
    
    

    public Ranking() {
    }
    
    

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.value) ^ (Double.doubleToLongBits(this.value) >>> 32));
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
        final Ranking other = (Ranking) obj;
        if (Double.doubleToLongBits(this.value) != Double.doubleToLongBits(other.value)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ranking{" + "value=" + value + '}';
    }
    
    
    
}
