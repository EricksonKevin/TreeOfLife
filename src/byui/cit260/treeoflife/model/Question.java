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
public class Question implements Serializable{
    
    private String question;
    private String answer;
    private String linkedWith;
    
    private Location [] location;

    public Location[] getLocation() {
        return location;
    }

    public void setLocation(Location[] location) {
        this.location = location;
    }

    public RankType[] getRanktype() {
        return ranktype;
    }

    public void setRanktype(RankType[] ranktype) {
        this.ranktype = ranktype;
    }
    private RankType [] ranktype;
    

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getLinkedWith() {
        return linkedWith;
    }

    public void setLinkedWith(String linkedWith) {
        this.linkedWith = linkedWith;
    }

    public Question() {
    }

    @Override
    public String toString() {
        return "Question{" + "question=" + question + ", answer=" + answer + ", linkedWith=" + linkedWith + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.question);
        hash = 29 * hash + Objects.hashCode(this.answer);
        hash = 29 * hash + Objects.hashCode(this.linkedWith);
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
        final Question other = (Question) obj;
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        if (!Objects.equals(this.linkedWith, other.linkedWith)) {
            return false;
        }
        return true;
    }
    
    
}
