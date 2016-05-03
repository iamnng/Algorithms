package com.study.algorithms.sort;

public class BubbleSortWhileLoop {
	public static int[] sort(int[] data){
		int len = data.length;
		boolean done = false;
		
		while(!done){
			done = false;
			for(int i = 0; i < len - 1; i++){
				if(data[i] > data[i + 1]){
					int temp = data[i];
					data[i] = data[i + 1];
					data[i + 1] = temp;
					done = true;
				}
			}
		}
		return data;
	}
	
	public static void main(String[] args){
		int[] arr = {5, 7, 9, 3, 4, 7, 99, 11, 33, 67, 55, 31, 1002, 998, 9999};
		int[] sorted = BubbleSortWhileLoop.sort(arr);
		for(int i = 0; i < sorted.length; i++){
			System.out.print(sorted[i] + " ");
		}
	}
}
