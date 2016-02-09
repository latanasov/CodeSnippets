/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringreverse;

/**
 *
 * @author lyuat
 */
public class StringReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String original = "abcdef";
        char cArr[] = original.toCharArray();
        int stringLength = cArr.length;
        int halfLength = stringLength / 2;
        for (int i = 0; i < halfLength; i++) {
            char temp = cArr[i];
            cArr[i] = cArr[stringLength - i - 1];
            cArr[stringLength - i - 1] = temp;
        }
        System.out.print(cArr);
    }
    
}
