/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findduplicates;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author lyuat
 */
/**
 * Find duplicates inside an array using sets and hash set*
 */
public class FindDuplicates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] array = {1, 1, 2, 3, 4, 5, 6, 7, 8, 8};

        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < array.length; i++) {
            //If same integer is already present then add method will return FALSE 
            if (set.add(array[i]) == false) {
                System.out.println("Duplicate element found : " + array[i]);
            }
        }
    }

}
