/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author lyuat
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6};
        int lowerBound = 0;
        int searchValue = 10;
        int upperBound = array.length;

        while (lowerBound < upperBound) {
            int middleBound = (lowerBound + upperBound) / 2;
            if (searchValue > array[middleBound]) {
                lowerBound = middleBound + 1;
            }
            if (searchValue < array[middleBound]) {
                upperBound = middleBound - 1;
            } else {
                System.out.print(array[lowerBound]);
                break;
            }

        }

    }

}
