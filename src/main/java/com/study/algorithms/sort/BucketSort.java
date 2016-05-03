package com.study.algorithms.sort;

import java.util.ArrayList;
import java.util.List;

public class BucketSort {
    private static final int DEFAULT_BUCKET_SIZE = 5;

    public static int[] sort(int[] array) {
        return sort(array, DEFAULT_BUCKET_SIZE);
    }

    public static int[] sort(int[] array, int bucketSize) {
        if (array.length == 0) {
            return array;
        }

        // Determine minimum and maximum values
        Integer minValue = array[0];
        Integer maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            } else if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        // Initialize buckets
        int bucketCount = (maxValue - minValue) / bucketSize + 1;
        List<List<Integer>> buckets = new ArrayList<List<Integer>>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<Integer>());
        }

        // Distribute input array values into buckets
        for (int i = 0; i < array.length; i++) {
            buckets.get((array[i] - minValue) / bucketSize).add(array[i]);
        }

        // Sort buckets and place back into input array
        int currentIndex = 0;
        for (int i = 0; i < buckets.size(); i++) {
        	int[] bucketArray = new int[buckets.get(i).size()];
        	for(int j = 0; j < buckets.get(i).size(); j++){
        		bucketArray[j] = buckets.get(i).get(j);
        	}
        	int[] sorted = BubbleSort.sort(bucketArray);
            for (int j = 0; j < sorted.length; j++) {
                array[currentIndex++] = sorted[j];
            }
        }
        return array;
    }
    
    public static void main(String[] args){
    	int[] arr = {5, 7, 9, 3, 4, 7, 99, 11, 33, 67, 55, 31, 1002, 998, 9999};
    	int[] sorted = BucketSort.sort(arr);
		for(int i = 0; i < sorted.length; i++){
			System.out.print(sorted[i] + " ");
		}
	}
}

