/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jums;

/**
 *
 * @author mypc
 */
public class UserDateBeans {
    private String name;
    private int year;
    private int mouth;
    private int day;
    private String type;
    private String tell;
    private String comment;
    public void UserDateBeans(){}
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getMonth(){
        return mouth;
    }
    public void setMouth(int mouth){
        this.mouth = mouth;
    }
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day = day;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getTell(){
        return tell;
    }
    public void setTell(String tell){
        this.tell = tell;
    }
    public String getComment(){
        return comment;
    }
    public void setComment(String ac){
        this.comment = comment;
    }
}
