/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obj2kadai;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author guest1Day
 */
abstract class human {

    boolean flg = false;

    public static ArrayList<Integer> cards = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13));

    ArrayList<Integer> myCard = new ArrayList<Integer>();

    abstract public ArrayList<Integer> setcard(ArrayList<Integer> cards);

    abstract public boolean chackSam();

    abstract public void open();
}
