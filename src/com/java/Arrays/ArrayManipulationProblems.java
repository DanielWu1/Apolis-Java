package com.java.Arrays;

import java.util.*;

public class ArrayManipulationProblems {

    public void printFrequencyOfEachElement(int[] array) {
        Map<Integer, Integer> table = new HashMap<Integer, Integer>();
        for(int i = 0; i < array.length; i++) {
            table.put(array[i], table.getOrDefault(array[i], 0) + 1);
        }
        for(Integer key: table.keySet()){
            System.out.println("Element " + key + " occurs " + table.get(key) + " times");
        }
    }

    // Problem 2: Print Elements in Reverse Order
    public static void printElementsInReverseOrder(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + (i > 0 ? ", " : "\n"));
        }
    }

    // Problem 3: Elements on Even Positions
    public static void printEvenPositionElements(int[] array) {
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + (i < array.length - 2 ? ", " : "\n"));
        }
    }

    // Problem 4: Largest Element in an Array
    public static int findLargestElement(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Problem 5: Smallest Element in an Array
    public static int findSmallestElement(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Problem 6: Number of Elements in an Array
    public static int countElements(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++){
            count++;
        }
        return count;
    }

    // Problem 7: Sum of All Items in an Array
    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Problem 8: Copy Elements of One Array into Another
    public static void copyArray(int[] source, int[] destination) {
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
        System.out.println("Copied array: " + Arrays.toString(destination));
    }

    // Problem 9: Linear Search
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Problem 10: Binary Search
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (array[mid] == target){
                return mid;
            }
            else if (array[mid] < target){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // Problem 11: Selection Sorting
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    // Problem 12: Bubble Sorting
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(array));
    }

    // Problem 13: Find Missing Number in the Array
    public static int findMissingNumber(int[] array) {
        int n = array.length + 1;
        int totalSum = n * (n + 1) / 2;
        for (int num : array) {
            totalSum -= num;
        }
        return totalSum;
    }

    // Problem 14: Second Largest Number in an Array
    public static int findSecondLargest(int[] array) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second;
    }

    // Problem 15: Separate Odd and Even Numbers in an Array
    public static void separateOddEvenNumbers(int[] array) {
        System.out.print("Odd numbers: ");
        for (int num : array) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.print("\nEven numbers: ");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    // Problem 16: Find Peak Element in the Array
    public static int findPeakElement(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                return array[i];
            }
        }
        return array.length > 1 ? Math.max(array[0], array[array.length - 1]) : array[0];
    }

    // Problem 17: Maximum Difference Between Two Elements
    public static int findMaximumDifference(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        return max - min;
    }

    // Problem 18: kth Smallest Element in an Array
    public static int findKthSmallestElement(int[] array, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < array.length; i++) {
            if (i < k) {
                maxHeap.add(array[i]);
            } else if (array[i] < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.add(array[i]);
            }
        }

        return maxHeap.peek();
    }

    // Problem 19: Remove Duplicates from an Array
    public static int[] removeDuplicates(int[] array) {
        Set<Integer> table = new HashSet<>();
        for (int i = 0; i < array.length; i++){
            table.add(array[i]);
        }
        int[] resultArray = new int[table.size()];
        int index = 0;
        for (Integer value : table) {
            resultArray[index++] = value;
        }

        return resultArray;
    }

    // Problem 20: Intersection of Two Arrays
    public static void printIntersection(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        int i = 0, j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                i++;
            } else if (array1[i] > array2[j]) {
                j++;
            } else {
                System.out.print(array1[i++] + " ");
                j++;
            }
        }
        System.out.println();
    }

    // Problem 21: Union of Two Arrays
    public static void printUnion(int[] array1, int[] array2) {
        int[] tempArray = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                tempArray[k++] = array1[i++];
            } else if (array1[i] > array2[j]) {
                tempArray[k++] = array2[j++];
            } else {
                tempArray[k++] = array1[i++];
                j++;
            }
        }
        while (i < array1.length) {
            tempArray[k++] = array1[i++];
        }
        while (j < array2.length) {
            tempArray[k++] = array2[j++];
        }
        int[] finalArray = Arrays.copyOf(tempArray, k);
        System.out.println("Union of arrays: " + Arrays.toString(finalArray));
    }

    // Problem 22: Find the Subarray with the Maximum Sum
    public int[] findMaxSumSubarray(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        int maxSum = array[0];
        int currentSum = array[0];
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 1; i < array.length; i++) {
            if (currentSum + array[i] > array[i]) {
                currentSum += array[i];
            } else {
                currentSum = array[i];
                tempStart = i;
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        return Arrays.copyOfRange(array, start, end + 1);
    }


    public static void main(String[] args) {
        ArrayManipulationProblems TestCase = new ArrayManipulationProblems();

        // Problem 1: Test case
        int[] array1 = {1, 2, 2, 3, 1, 4, 5};
        System.out.println("Problem 1: Frequency of Each Element in an Array");
        TestCase.printFrequencyOfEachElement(array1);
        System.out.println();

        // Problem 2: Test case
        int[] array2 = {3, 7, 1, 9, 5};
        System.out.println("Problem 2: Print Elements in Reverse Order");
        TestCase.printElementsInReverseOrder(array2);
        System.out.println();

        // Problem 3: Test case
        System.out.println("Problem 3: Elements on Even Positions");
        TestCase.printEvenPositionElements(array2);
        System.out.println();

        // Problem 4: Test case
        System.out.println("Problem 4: Largest Element in an Array");
        System.out.println("Largest element: " + TestCase.findLargestElement(array2));
        System.out.println();

        // Problem 5: Test case
        System.out.println("Problem 5: Smallest Element in an Array");
        System.out.println("Smallest element: " + TestCase.findSmallestElement(array2));
        System.out.println();

        // Problem 6: Test case
        System.out.println("Problem 6: Number of Elements in an Array");
        System.out.println("Number of elements: " + TestCase.countElements(array2));
        System.out.println();

        // Problem 7: Test case
        System.out.println("Problem 7: Sum of All Items in an Array");
        System.out.println("Sum of array: " + TestCase.sumOfArray(array2));
        System.out.println();

        // Problem 8: Test case
        int[] destination = new int[array2.length];
        System.out.println("Problem 8: Copy Elements of One Array into Another");
        TestCase.copyArray(array2, destination);
        System.out.println();

        // Problem 9: Test case
        System.out.println("Problem 9: Linear Search");
        int target = 7;
        System.out.println("Index of " + target + ": " + TestCase.linearSearch(array2, target));
        System.out.println();

        // Problem 10: Test case
        int[] sortedArray = {1, 3, 5, 7, 9};
        System.out.println("Problem 10: Binary Search");
        System.out.println("Index of " + target + ": " + TestCase.binarySearch(sortedArray, target));
        System.out.println();

        // Problem 11: Test case
        int[] arrayToSort = {3, 7, 1, 9, 5};
        System.out.println("Problem 11: Selection Sorting");
        TestCase.selectionSort(arrayToSort);
        System.out.println();

        // Problem 12: Test case
        int[] arrayToSort2 = {3, 7, 1, 9, 5};
        System.out.println("Problem 12: Bubble Sorting");
        TestCase.bubbleSort(arrayToSort2);
        System.out.println();

        // Problem 13: Test case
        int[] arrayWithMissingNumber = {1, 2, 3, 4, 6, 7, 8, 9};
        System.out.println("Problem 13: Find Missing Number in the Array");
        System.out.println("Missing number: " + TestCase.findMissingNumber(arrayWithMissingNumber));
        System.out.println();

        // Problem 14: Test case
        System.out.println("Problem 14: Second Largest Number in an Array");
        System.out.println("Second largest number: " + TestCase.findSecondLargest(array2));
        System.out.println();

        // Problem 15: Test case
        int[] arrayOddEven = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Problem 15: Separate Odd and Even Numbers in an Array");
        TestCase.separateOddEvenNumbers(arrayOddEven);
        System.out.println();

        // Test case for Problem 16: Find Peak Element in the Array
        int[] array16 = {1, 3, 5, 2, 4, 6, 8};
        System.out.println("Problem 16: Find Peak Element in the Array");
        System.out.println("Peak element: " + TestCase.findPeakElement(array16));
        System.out.println();

        // Test case for Problem 17: Maximum Difference Between Two Elements
        int[] array17 = {4, 2, 10, 8, 7};
        System.out.println("Problem 17: Maximum Difference Between Two Elements");
        System.out.println("Maximum difference: " + TestCase.findMaximumDifference(array17));
        System.out.println();

        // Test case for Problem 18: kth Smallest Element in an Array
        int[] array18 = {4, 2, 10, 8, 7};
        int k = 3;
        System.out.println("Problem 18: kth Smallest Element in an Array");
        System.out.println("The " + k + "rd smallest element: " + TestCase.findKthSmallestElement(array18, k));
        System.out.println();

        // Test case for Problem 19: Remove Duplicates from an Array
        int[] array19 = {3, 2, 5, 2, 8, 5};
        System.out.println("Problem 19: Remove Duplicates from an Array");
        int[] uniqueArray19 = TestCase.removeDuplicates(array19);
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray19));
        System.out.println();

        // Test case for Problem 20: Intersection of Two Arrays
        int[] array20a = {3, 2, 5, 8};
        int[] array20b = {5, 2, 9};
        System.out.println("Problem 20: Intersection of Two Arrays");
        TestCase.printIntersection(array20a, array20b);
        System.out.println();

        // Test case for Problem 21: Union of Two Arrays
        int[] array21a = {3, 2, 5, 8};
        int[] array21b = {5, 7, 9};
        System.out.println("Problem 21: Union of Two Arrays");
        TestCase.printUnion(array21a, array21b);
        System.out.println();

        // Test case for Problem 22
        int[] array22 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Problem 22: Find the Subarray with the Maximum Sum");
        int[] maxSumSubarray = TestCase.findMaxSumSubarray(array22);
        System.out.println("The subarray with the maximum sum: " + Arrays.toString(maxSumSubarray));
        System.out.println();
    }
}
