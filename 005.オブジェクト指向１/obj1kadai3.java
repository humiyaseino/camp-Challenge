/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

/**
 *
 * @author guest1Day
 */
public class obj1kadai3 {

    public String name = "";
    public int age = 0;

    public void setHuman(String n, int a) {
        name = n;
        age = a;
    }

    public void showName(String name) {
        System.out.println(name);
    }

    public void showAge(int age) {
        System.out.println(age);
    }
}
class human extends obj1kadai3{
    public void resetHuman(){
        name = "";
        age = 0;
        
    }
}
