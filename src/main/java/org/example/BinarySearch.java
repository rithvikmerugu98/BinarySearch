package org.example;

public class BinarySearch {
    /**
     * This method takes a key and searches for the element in arr using binary search.
     * If the element is found then we return the index of that element
     * else we return -1.
     *
     * In case of duplicates the program returns the value of the first occurrence of the element
     *
     * @param arr int[] - containing all the elements in sorted order
     * @param key int - the value of the key to be found.
     * @return int - index of the key in arr.
     */
    public static int binarySearch(int[] arr, int key){
        int first = 0;
        int last=arr.length-1;

        int mid = (first + last)/2;

        while( first <= last ){
            if ( arr[mid] < key ){
                first = mid + 1;
            }else if ( arr[mid] == key ){
                return mid;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        return -1;
    }
}
