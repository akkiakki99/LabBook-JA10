package com.capg.Lab6;

import java.util.HashMap;
import java.util.Map;

public class Ex3Squares {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};

		Map<Integer,Integer> numsquares = getSquares(arr);
		
		System.out.println(numsquares);
	}

	
	static Map<Integer,Integer> getSquares(int[] arr)
	{
		Map<Integer,Integer> mapsquares = new HashMap<>();
		
		for(int i = 0;i< arr.length;i++)
		{
			mapsquares.put(arr[i], arr[i]*arr[i]);
		}
		
		return mapsquares;
	}
}
