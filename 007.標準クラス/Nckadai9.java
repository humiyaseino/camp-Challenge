/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nckadai9;

import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.util.Calendar;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author guest1Day
 */
public class Nckadai9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //応用課題
        try {

            File log = new File("log.txt");
            FileWriter fwLog = new FileWriter(log, false);
            Calendar cal = Calendar.getInstance();

            int mm = cal.get(Calendar.MONTH) + 1;
            int dd = cal.get(Calendar.DATE);
            int hh = cal.get(Calendar.HOUR_OF_DAY);
            int MM = cal.get(Calendar.MINUTE);

            fwLog.write(mm + "月" + dd + "日" + hh + "時" + MM + "分\n処理開始\n");

            fwLog.write(mm + "月" + dd + "日" + hh + "時" + MM + "分\nArrayList:al:(1)、(2)、(3)、作成\n");
            ArrayList al = new ArrayList();
            al.add(1);
            al.add(2);
            al.add(3);

            fwLog.write(mm + "月" + dd + "日" + hh + "時" + MM + "分\nArrayList:al:をランダムに処理\n");
            Collections.shuffle(al);

            fwLog.write(mm + "月" + dd + "日" + hh + "時" + MM + "分\n処理終了");

            fwLog.close();

            FileReader frLog = new FileReader(log);
            BufferedReader brLog = new BufferedReader(frLog);

            String strLog;
            while ((strLog = brLog.readLine()) != null) {
                System.out.println(strLog);
            }

            frLog.close();
            brLog.close();
            System.out.println("ArrayList結果" + al);

        } catch (Exception ex) {
        }
    }
}
