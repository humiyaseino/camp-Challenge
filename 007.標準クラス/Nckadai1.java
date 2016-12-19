/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nckadai1;

import java.util.Date;
import java.util.Calendar;
import java.text.*;
import java.io.*;
/**
 *
 * @author guest1Day
 */
public class Nckadai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar cal = Calendar.getInstance();
        cal.set(2016,1,1);
        Date date = cal.getTime();
        
        System.out.println(date.getTime());
    }
    
}
