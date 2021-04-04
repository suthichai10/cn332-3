/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sutic
 */
public class Bbsort1main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        person person = new person("Suthichai" , "Chukaew" , 21 , "male");
        person person1 = new person("Kittisak" , "Boonchalee" , 19 , "female");
        person[] p = {person , person1};
        bbsort sort = new bbsort();
        sort.sort(p, "age");
        for(int i = 0 ; i < p.length ; i ++) {
            System.out.println(p[i]);
        }
        String s = "dsa";
        s = sort.sort(s);
        System.out.println(s);
    }
    
}
