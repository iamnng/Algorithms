package com.study.algorithms.search;

public class LinearSearch {
	public boolean search(int[] data, int key){
		for(int i = 0; i < data.length; i++){
			if(data[i] == key){
				return true;
			}
		}
		return false;
	}
}
