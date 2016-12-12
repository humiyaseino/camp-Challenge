/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai7;
import java.util.ArrayList;
/**
 *
 * @author guest1Day
 */
public class Kadai7 {
    static ArrayList<String> data=new ArrayList <String>();
    static int id = 1;
    static String ids;
    static int limit = 2;
    //static String name;
    //static String birth;
    //static String age;
    
    static ArrayList<String> getData(int id){
        ids = String.valueOf(id);
        switch(ids){
            case "0":
                data.add(ids);
                data.add("yosida");
                data.add("1949,3,4");
                data.add("26");
                data.add("tokyo");
                break;
            case  "1":
                data.add(ids);
                data.add("tanaka");
                data.add("1959,2,14");
                data.add("16");
                data.add(null);
                break;
            case "2":
                data.add(ids);
                data.add("kimura");
                data.add("1939,8,9");
                data.add("36");
                data.add("kanagawa");
                break;
        }
        return data;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(id=0;id<3;id++){
            data.clear();
            data=getData(id);
            data.remove(ids);
            data.remove(null);
            if(id==limit){
                break;
            }
            for(String val: data){
                System.out.println(val);
            }
            
            }
        
        /*for(String val : data){
            System.out.println(val);
            
        }*/
    }
    
}