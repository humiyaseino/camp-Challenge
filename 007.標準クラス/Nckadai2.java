/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nckadai2;

import java.util.*;
/**
 *
 * @author guest1Day
 */
public class Nckadai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar cal = Calendar.getInstance();
        int yy = cal.get(Calendar.YEAR);
        int mm = cal.get(Calendar.MONTH)+1;
        int dd = cal.get(Calendar.DAY_OF_MONTH);
        int hh = cal.get(Calendar.HOUR_OF_DAY);
        int MM = cal.get(Calendar.MINUTE);
        int mmm = cal.get(Calendar.SECOND);
        System.out.println("今日は"+yy+"年"+mm+"月"+dd+"日"+hh+"時"+MM+"分"+mmm+"秒です");
        
    }
    
}
