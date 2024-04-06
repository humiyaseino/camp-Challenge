/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ckadai5;

import java.io.UnsupportedEncodingException;

/**
 *
 * @author guest1Day
 */
public class Ckadai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
        // TODO code application logic here
        String name = "ｓｓｓ";
        byte[] nameb = name.getBytes("UTF-8");
        int namei = name.length();
        System.out.println("名前は" + name + "文字数は" + namei + "バイト数はUTF-8で" + nameb + "です");
    }

}
