package com.study.algorithms.sort;

public class BubbleSort {
	public static int[] sort(int[] data){
		int len = data.length;
		for(int i = 0; i < len; i++){
			for(int j = 0; j < len - 1 - i; j++){
				if(data[j] > data[j + 1]){
					int temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}
		return data;
	}
	
	public static void main(String[] args){
		int[] arr = {5, 7, 9, 3, 4, 7, 99, 11, 33, 67, 55, 31, 1002, 998, 9999};
		int[] sorted = BubbleSort.sort(arr);
		for(int i = 0; i < sorted.length; i++){
			System.out.print(sorted[i] + " ");
		}
	}
}
