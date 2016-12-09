/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.Serializable;
import java.util.Date;
/**
 *
 * @author guest1Day
 */
public class ResultDate implements Serializable {
    private Date d;
    private String luck;
    
    public ResultDate(){}
   
    /**
    * @return the d
    */
    public Date getD() {
        return d;
    }
    
    /**
     * param d the d to set
     */
    public void setD(Date d) {
        this.d = d;
    }
    
    /**
     * return the luck
     */
    public String getluck() {
        return luck;
    }

    public void setLuck(String luck) {
        this.luck = luck;
    }
    
}
