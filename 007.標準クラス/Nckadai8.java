/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nckadai8;

import java.io.*;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author guest1Day
 */
public class Nckadai8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            File txt = new File("test.txt");//ファイルのオープン

            FileWriter fw = new FileWriter(txt);//ファイルの書き込みモード設定

            fw.write("清野です、プログラミングを勉強中です。");//ファイル入力
            
            fw.close();//ファイルを閉じる
           
            FileReader txt1 = new FileReader(txt);//ファイル読み込みモード
            
            BufferedReader txt2 = new BufferedReader(txt1);//テキストからの読み込みモード
            
            String txt3 = txt2.readLine();//txt3にtxt2のテキストを挿入
            
            System.out.println(txt3);
            
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }

}
