/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearandbinsearch;

/**
 *
 * @author mega_
 */
public class LinearAndBinSearch {

    private static int searchLinear(int arr[], int searchNumber) {
        boolean foundNumber = false;

        //Linear search
        for (int i = 0; i < numbers.length; i++) {
            if (arr[i] == searchNumber) {
                return i;
            }

        }
        return -1;
    }

    private static int searchBinary(int[] arr, int searchNumber, int start, int end) {
        int mid = start + (end - start) / 2;
        if(start>end){
            return -1;
        }
        if (arr[mid] > searchNumber) {

            return searchBinary(arr, searchNumber, start, mid - 1);
        } else if (arr[mid] < searchNumber) {
            return searchBinary(arr, searchNumber, mid + 1, end);

        } else if (arr[mid] == searchNumber) {
            return mid;
        }
        return -2;
    }
    
        private static int searchBinary(int[] arr, int searchNumber) {
            return searchBinary(arr, searchNumber, 0, arr.length-1);
       
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {1, 5, 6, 8, 9, 11, 21, 27, 31, 80};
        System.out.println("Hello Evil World");
        System.out.println("Element number 4: " + numbers[4]);
        SearchChili searcher = new SearchChili();

       int search = 81;
        int index = searcher.searchBinary(numbers, search);
        if (index == -1) {
            System.out.println("These are not the droids you are looking for");
        } else {
            System.out.println("81 is at: " + index);
        }
    }

}
