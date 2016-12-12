/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai3;

/**
 *
 * @author guest1Day
 */
public class Kadai3 {

    static int keisan(int a, int b, boolean c) {
        int d = a * b;
        if (c == true) {
            d*=d;
        }
        return d;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 3;//適当な数字
        int b = 5;//決められた数字
        boolean c = false;//フラグ
        
        int e =keisan(a,b,c);
        System.out.print(e);
    }

}
