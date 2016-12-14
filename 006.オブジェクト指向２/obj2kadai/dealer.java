/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj2kadai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author guest1Day
 *
 */
public class dealer extends human {

    ArrayList <Integer> dCard =new ArrayList<>(); 
    
    public ArrayList setcard(ArrayList <Integer> dCard) {
         for (int a = 0; a < dCard.size(); a++) {
            myCard.add(dCard.get(a));
         }
         //System.out.println(myCard);
        return myCard;
    }

    public boolean chackSam() {
        int sum = 0;
        for (int a = 0; a < myCard.size(); a++) {
            sum += ((Integer) myCard.get(a)).intValue();
        }
            if (sum < 17) {
                flg = true;
            }
            return flg;
        }
    
    public ArrayList deal(ArrayList<Integer> cards) {
        Collections.shuffle(cards);
        
        dCard.add(cards.get(0));
        dCard.add(cards.get(1));
        //System.out.println(dCard);
        return dCard;
    }

    public ArrayList hit(ArrayList <Integer> cards) {
        Collections.shuffle(cards);
        if(flg){
        myCard.add(cards.get(0));
        }
        return myCard;
    }

    public void open() {
        int num = 0;
        for (int a = 0; a < myCard.size(); a++) {
            num += ((Integer) myCard.get(a)).intValue();
        }
        System.out.println("ディーラー");
        System.out.println(myCard);
        System.out.println("合計"+num);
        

    }
    
    public int battle() {
        int sum = 0;
        for (int a = 0; a < myCard.size(); a++) {
            sum += ((Integer) myCard.get(a)).intValue();
        }
        return sum;
    }
}
