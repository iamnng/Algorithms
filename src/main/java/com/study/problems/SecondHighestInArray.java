package com.study.problems;

public class SecondHighestInArray {
	public static void execute(int[] data){
		int highest = 0;
		int second = 0;
		for(int i = 0; i < data.length; i++){
			if(data[i] > highest){
				second = highest;
				highest = data[i];
			} else if((data[i] > second) && (data[i] != highest)){
				second = data[i];
			}
		}
		System.out.println("Highest = " + highest);
		System.out.println("Second Highest = " + second);
	}
	
	public static void main(String[] args){
		int[] arr = {5,8,2,1,8,4,5,0,10,99,10,3,1};
		SecondHighestInArray.execute(arr);
	}
}
