package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        int lengthOfMergedArray = array1.length + array2.length;
        Integer[] mergedArray = new Integer[lengthOfMergedArray];

        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }

        for (int i = array1.length; i < lengthOfMergedArray; i++) {
            mergedArray[i] = array2[i - array1.length];
        }

        return mergedArray;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] rotatedArray = new Integer[array.length];

        for (int i = 0; i < array.length; i++) {
            rotatedArray[i] = array[(i + index) % array.length];
        }

        return rotatedArray;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int numOfOccurences = 0;
        for (Integer i : array1) {
            if (i.equals(valueToEvaluate)) numOfOccurences++;
        }

        for (Integer i : array2) {
            if (i.equals(valueToEvaluate)) numOfOccurences++;
        }

        return numOfOccurences;
    }

    public Integer mostCommon(Integer[] array) {
        Arrays.sort(array);

        int mostCommonInteger = array[0];
        int mostCommonCount = 1;
        int currentCount = 1;

        for(int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                currentCount++;
            } else {
                if (currentCount > mostCommonCount) {
                    mostCommonCount = currentCount;
                    mostCommonInteger = array[i - 1];
                }
                currentCount = 1;
            }
        }

        if (currentCount > mostCommonCount) {
            mostCommonInteger = array[array.length - 1];
        }

        return mostCommonInteger;
    }
}
