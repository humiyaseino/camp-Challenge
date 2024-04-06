/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kadai1;

/**
 *
 * @author guest1Day
 */
public class Kadai1 {
    static boolean flg = false;

    static boolean printprf(String name, String birth, int age) {
        flg=true;
        System.out.println("名前は" + name + "です");
        System.out.println("生年月日は" + birth + "です");
        System.out.println("年齢は" + age + "です");
        return flg;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = "S_H";
        String birth = "2024年11月3日です";
        int age = 19;

        for (int i = 0; i < 10; i++) {
            flg = printprf(name, birth, age);
        }

        if (flg == true) {
            System.out.println("この処理は正しく実行されました");

        }
    }

}
