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
public class RankType implements Serializable{
    
    private String ranType;
    private String rankDescription;
    private Integer thresholdValue;

    public String getRanType() {
        return ranType;
    }

    public void setRanType(String ranType) {
        this.ranType = ranType;
    }

    public String getRankDescription() {
        return rankDescription;
    }

    public void setRankDescription(String rankDescription) {
        this.rankDescription = rankDescription;
    }

    public Integer getThresholdValue() {
        return thresholdValue;
    }

    public void setThresholdValue(Integer thresholdValue) {
        this.thresholdValue = thresholdValue;
    }

    @Override
    public String toString() {
        return "RankType{" + "ranType=" + ranType + ", rankDescription=" + rankDescription + ", thresholdValue=" + thresholdValue + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.ranType);
        hash = 89 * hash + Objects.hashCode(this.rankDescription);
        hash = 89 * hash + Objects.hashCode(this.thresholdValue);
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
        final RankType other = (RankType) obj;
        if (!Objects.equals(this.ranType, other.ranType)) {
            return false;
        }
        if (!Objects.equals(this.rankDescription, other.rankDescription)) {
            return false;
        }
        if (!Objects.equals(this.thresholdValue, other.thresholdValue)) {
            return false;
        }
        return true;
    }

    
    public RankType() {
    }
    
    
}
