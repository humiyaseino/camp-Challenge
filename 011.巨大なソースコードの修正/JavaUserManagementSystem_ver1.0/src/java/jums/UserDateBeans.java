/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jums;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author mypc
 */
public class UserDateBeans implements Serializable{
    private String name;
    private String year;
    private String month;
    private String day;
    private String type;
    private String tell;
    private String comment;
    private String types;
    private ArrayList<String> arrayTypes = new ArrayList<String>();
    public void UserDateBeans(){}
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getYear(){
        return year;
    }
    public void setYear(String year){
        this.year = year;
    }
    public String getMonth(){
        return month;
    }
    public void setMouth(String month){
        this.month = month;
    }
    public String getDay(){
        return day;
    }
    public void setDay(String day){
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
    public void setComment(String comment){
        this.comment = comment;
    }
    //nullのチェック
    public boolean checkAll(){
        return !(name.isEmpty() || year.isEmpty() || month.isEmpty() || day.isEmpty() || type == null || tell.isEmpty() || comment.isEmpty());
    }
    //nullはどれかをStringで返す
    public String checkType(){
        if (name.isEmpty()){
            arrayTypes.add("名前");
        }
        if (year.isEmpty()){
            arrayTypes.add("年");
        }
        if (month.isEmpty()){
            arrayTypes.add("月");
        }
        if (day.isEmpty()){
            arrayTypes.add("日");
        }
        if (type == null){
            arrayTypes.add("種別");
        }
        if (tell.isEmpty()){
            arrayTypes.add("電話番号");
        }
        if (comment.isEmpty()){
            arrayTypes.add("自己紹介");
        }
        types = arrayTypes.toString();
        return types;
    }
}

