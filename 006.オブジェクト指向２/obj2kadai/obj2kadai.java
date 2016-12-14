/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj2kadai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

/**
 *
 * @author guest1Day
 */
public class obj2kadai {

    static ArrayList<Integer> myCard = new ArrayList<>();
    static ArrayList<Integer> cards = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13));
    static boolean flg = false;

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        dealer dtime = new dealer();
        user utime = new user();
        // dtime.deal(cards);
        dtime.setcard(dtime.deal(cards));
        dtime.chackSam();
        dtime.hit(cards);
        dtime.open();
        //utime.deal(cards);
        utime.setcard(utime.deal(cards));
        utime.chackSam();
        utime.hit(cards);
        utime.open();
        if (dtime.battle() > 21 && utime.battle() > 21 || utime.battle() == dtime.battle()) {
            System.out.println("引き分けです");
        } else if (dtime.battle() <= 21 && dtime.battle() > utime.battle() || utime.battle() > 21) {
            System.out.println("あなたの負けです");
        } else {
            System.out.println("あなたの勝ちです");
        }
    }

}
