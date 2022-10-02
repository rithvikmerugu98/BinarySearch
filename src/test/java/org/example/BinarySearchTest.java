package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    void testBinarySearchValidSearch() {
        int[] arr = new int[]{1,4,5,11,16};
        int key = 5;
        int index = BinarySearch.binarySearch(arr, key);
        int expected = 2;
        assertEquals(expected, index, String.format("Expected the index to be %d but got %d", expected, index));
    }

    @Test
    void testBinarySearchInvalidSearch() {
        int[] arr = new int[]{1,4,5,11,16};
        int key = 10;
        int index = BinarySearch.binarySearch(arr, key);

        int expected = -1;
        assertEquals(expected, index, String.format("Expected the index to be %d but got %d", expected, index));
    }

    @Test
    void testBinarySearchEmptyArray() {
        int[] arr = new int[]{};
        int key = 10;
        int index = BinarySearch.binarySearch(arr, key);

        int expected = -1;
        assertEquals(expected, index, String.format("Expected the index to be %d but got %d", expected, index));
    }

    @Test
    void testBinarySearchSingleElement() {
        int[] arr = new int[]{2};
        int key = 2;
        int index = BinarySearch.binarySearch(arr, key);

        int expected = 0;
        assertEquals(expected, index, String.format("Expected the index to be %d but got %d", expected, index));
    }

    @Test
    void testBinarySearchNegativeValueArray() {
        int[] arr = new int[]{-1,-4,-5,-11,16};
        int key = 16;
        int index = BinarySearch.binarySearch(arr, key);

        int expected = 4;
        assertEquals(expected, index, String.format("Expected the index to be %d but got %d", expected, index));
    }

    @Test
    void testBinarySearchNegativeKey() {
        int[] arr = new int[]{-1,-4,-5,11,16};
        int key = -5;
        int index = BinarySearch.binarySearch(arr, key);

        int expected = 2;
        assertEquals(expected, index, String.format("Expected the index to be %d but got %d", expected, index));
    }

    @Test
    void testBinarySearchDuplicateValues() {
        int[] arr = new int[]{1, 2, 3, 4, 4};
        int key = 4;
        int index = BinarySearch.binarySearch(arr, key);
        int expected = 3;
        assertEquals(expected, index, String.format("Expected the index to be %d but got %d", expected, index));
    }

}