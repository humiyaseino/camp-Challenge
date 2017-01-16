package jums;

import java.sql.Timestamp;
import java.util.Date;
import java.util.*;
import org.joda.time.DateTime;//時間取得系ライブラリjode.time
import java.io.Serializable;

/**
 * ユーザー情報を持ちまわるJavaBeans
 * データベースのカラムと型に対応させている(DTO)。データの挿入、取り出しどちらにも便利
 * @version 1.00
 * @author hayashi-s
 */
public class UserDataDTO implements Serializable{
    private int userID;
    private String name;
    private Date birthday;
    private String tell;
    private int type;
    private String comment;
    private Timestamp newDate;
    
    private ArrayList<Integer> allUserID = new ArrayList();
    private ArrayList<String> allName = new ArrayList();
    private ArrayList<Date> allBirthday = new ArrayList();
    private ArrayList<Integer> allType = new ArrayList();
    private ArrayList<Timestamp> allNewDate = new ArrayList();
    
    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public Date getBirthday(){
        return birthday;
    }
    public void setBirthday(Date birthday){
        this.birthday = birthday;
    }
    
    public String getTell(){
        return tell;
    }
    public void setTell(String tell){
        this.tell = tell;
    }
    
    public int getType(){
        return type;
    }
    public void setType(int type){
        this.type = type;
    }
    
    public String getComment(){
        return comment;
    }
    public void setComment(String comment){
        this.comment = comment;
    }
    
    public Timestamp getNewDate() {
        return newDate;
    }
    public void setNewDate(Timestamp newDate) {
        this.newDate = newDate;
    }
    
    
    public ArrayList<Integer> getAllUserID(){
        return allUserID;
    }
    public int getAllUserID(int i){
        return allUserID.get(i);
    }
    public void setAllUserID(ArrayList<Integer> allUserID){
        this.allUserID = allUserID;
    }
    public void upDateAllUserID(int id){
        this.allUserID.add(id);
    }
    
    
    public ArrayList<String> getAllName(){
        return allName;
    }
    public String getAllName(int i){
        return allName.get(i);
    }
    public void setAllName(ArrayList<String> allName){
        this.allName = allName;
    }
    public void upDateAllName(String name){
        this.allName.add(name);
    }
    
    
    
    public ArrayList<Date> getAllBirthday(){
        return allBirthday;
    }
    public Date getAllBirthday(int i){
        return allBirthday.get(i);
    }
    public void setAllBirthday(ArrayList<Date> allBirthday){
        this.allBirthday = allBirthday;
    }
    public void upDateAllBirthday(Date birthday){
        this.allBirthday.add(birthday);
    }
    
    
    
    public ArrayList<Integer> getAllType(){
        return allType;
    }
    public int getAllType(int i){
        return allType.get(i);
    }
    public void setAllType(ArrayList<Integer> allType){
        this.allType = allType;
    }
    public void upDateAllType(int type){
        this.allType.add(type);
    }
    
    
    public ArrayList<Timestamp>getAllNewDate(){
        return allNewDate;
    }
    public Date getAllNewDate(int i){
        return allNewDate.get(i);
    }
    public void setAllNewDate(ArrayList<Timestamp> allNewDate){
        this.allNewDate = allNewDate;
    }
    public void upDateAllNewDate(Timestamp NewDate){
        this.allNewDate.add(NewDate);
    }
    
    //birthdayから年月日を取得
    public int getYear(Date birthday){
        DateTime dt = new DateTime(birthday);
        int year = dt.getYear();
        return year;
    }
    public int getMonth(Date birthday){
        DateTime dt = new DateTime(birthday);
        int Month = dt.getMonthOfYear();
        return Month;
    }
    public int getDay(Date birthday){
        DateTime dt = new DateTime(birthday);
        int Day = dt.getDayOfMonth();
        return Day;
    }
    
}
