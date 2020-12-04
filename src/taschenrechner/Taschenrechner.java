/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechner;

/**
 *
 * @author ml11
 */
public class Taschenrechner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int zahl1 = 1;
        int zahl2 = 2;

        int result = add(zahl1, zahl2);
        int result_sub = subtract(zahl1, zahl2);
        

        System.out.println(result);
        System.out.println(result_sub);
        
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }
}
