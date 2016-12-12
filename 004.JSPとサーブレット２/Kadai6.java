/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai6;

import java.util.HashMap;

/**
 *
 * @author guest1Day
 */
public class Kadai6 {

    static HashMap<String, String> data
            = new HashMap<String, String>(3);
    
    static int id =1;//idナンバー

    static HashMap getdata(int id) {
        String ids = String.valueOf(id);
        switch (ids) {
            case "0":
                data.put("name", "tanaka");
                data.put("birth", "1992,4,6");
                data.put("age", "23");
                data.put("zitaku", "tokyo");
                break;
            case "1":
                data.put("name", "kikuti");
                data.put("birth", "1962,5,28");
                data.put("age", "53");
                data.put("zitaku","kyoto");
                break;
            case "2":
                data.put("name", "kimura");
                data.put("birth", "1977,12,7");
                data.put("age", "43");
                data.put("zitaku", "kanagawa");
                break;
        }
        return data;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        data=getdata(id);
        System.out.println(data.get("name"));
        System.out.println(data.get("birth"));
        System.out.println(data.get("age"));
        System.out.println(data.get("zitaku"));
    }

}
