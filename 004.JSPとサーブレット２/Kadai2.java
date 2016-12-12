/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai2;

/**
 *
 * @author guest1Day
 */
public class Kadai2 {
    static String keisan(int i){
        if(i % 2 ==0){
            return "これは偶数です";
        }else{
            return "これは奇数です";
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 100;//元の数字
        String hantei = keisan(i);
        System.out.println(hantei);
    }
    
}
