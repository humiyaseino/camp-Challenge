/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nckadai4;

import java.util.*;
/**
 *
 * @author guest1Day
 */
public class Nckadai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
	Calendar cal1 = Calendar.getInstance();
    	Calendar cal2 = Calendar.getInstance();

    	cal1.set(2015, 1, 1);
    	cal2.set(2016, 12, 31, 59, 59, 59);

    	long call1 = cal1.getTimeInMillis();
    	long call2 = cal2.getTimeInMillis();
    	System.out.println(call1 - call2);
        
        
    }
    
}
