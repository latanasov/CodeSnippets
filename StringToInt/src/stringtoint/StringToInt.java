/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtoint;

/**
 *
 * @author lyuat
 */
public class StringToInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String s = "1337";
       int sLength=s.length();
       int sResult=0;
       //TODO Add check if negative
        for (int i = 0; i < sLength; i++) {
            
            sResult=sResult*10;
            sResult = sResult + s.charAt(i) -'0';
        }
        System.out.print(sResult);
    }
    
}
