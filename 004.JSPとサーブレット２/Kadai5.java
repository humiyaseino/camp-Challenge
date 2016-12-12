/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai5;

import java.util.ArrayList;

/**
 *
 * @author guest1Day
 */
public class Kadai5 {

    static ArrayList<String> data = new ArrayList<String>();
    static int id = 22;
    static String name = "seino";
    static String birth = "1987年12月3日";
    static String age = "29";

    static ArrayList<String> getdate(int id, String name, String birth, String age) {
        String ids = String.valueOf(id);
        data.add(ids);
        data.add(name);
        data.add(birth);
        data.add(age);
        return data;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        data = getdate(id, name, birth, age);
        data.remove(0);
        for (String val : data) {
            System.out.println(val);
        }

    }

}
