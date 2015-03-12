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
public class Inventory implements Serializable{
    
    private String invType;
    private Integer numberinStock;
    private Integer reqAmount;
    
    private RankType[] ranktype;

    public RankType[] getRanktype() {
        return ranktype;
    }

    public void setRanktype(RankType[] ranktype) {
        this.ranktype = ranktype;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
    private Armor armor;
    

    public String getInvType() {
        return invType;
    }

    public void setInvType(String invType) {
        this.invType = invType;
    }

    public Integer getNumberinStock() {
        return numberinStock;
    }

    public void setNumberinStock(Integer numberinStock) {
        this.numberinStock = numberinStock;
    }

    public Integer getReqAmount() {
        return reqAmount;
    }

    public void setReqAmount(Integer reqAmount) {
        this.reqAmount = reqAmount;
    }

    public Inventory() {
    }

    @Override
    public String toString() {
        return "Inventory{" + "invType=" + invType + ", numberinStock=" + numberinStock + ", reqAmount=" + reqAmount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.invType);
        hash = 41 * hash + Objects.hashCode(this.numberinStock);
        hash = 41 * hash + Objects.hashCode(this.reqAmount);
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
        final Inventory other = (Inventory) obj;
        if (!Objects.equals(this.invType, other.invType)) {
            return false;
        }
        if (!Objects.equals(this.numberinStock, other.numberinStock)) {
            return false;
        }
        if (!Objects.equals(this.reqAmount, other.reqAmount)) {
            return false;
        }
        return true;
    }
    
    
}
