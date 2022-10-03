package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    void testBinarySearchRightOnly () {
        int[] arr = new int[]{1,4,5,11,16};
        int key = 16;
        int index = BinarySearch.binarySearch(arr, key);
        int expected = 4;
        assertEquals(expected, index, String.format("Expected the index to be %d but got %d", expected, index));
    }

    @Test
    void testBinarySearchInvalidRightSearch() {
        int[] arr = new int[]{1,4,5,11,16};
        int key = 17;
        int index = BinarySearch.binarySearch(arr, key);

        int expected = -1;
        assertEquals(expected, index, String.format("Expected the index to be %d but got %d", expected, index));
    }

    @Test
    void testBinarySearchValidLeftSearch() {
        int[] arr = new int[]{1,4,5,11,16};
        int key = 4;
        BinarySearch search = new BinarySearch();
        int index = search.binarySearch(arr, key);
        int expected = 1;
        assertEquals(expected, index, String.format("Expected the index to be %d but got %d", expected, index));
    }

}