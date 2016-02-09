/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrangeoddeven;

/**
 *
 * @author lyuat
 */
public class ArrangeOddEven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = {2, 1, 3, 4, 7, 9, 24, 98};
        int evenArray[] = new int[arr.length / 2];
        int oddArray[] = new int[arr.length / 2];
        int evenIndex = 0;
        int oddIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenArray[evenIndex] = arr[i];
                evenIndex++;
            } else {
                oddArray[oddIndex] = arr[i];
                oddIndex++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = evenArray[i / 2];

            } else {
                arr[i] = oddArray[i / 2];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

}
