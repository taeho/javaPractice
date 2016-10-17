package com.amikth.codility.lesson2;

/*
 * 
 * CyclicRotation - Rotate an array to the right by a given number of steps.
 * 
 * A zero-indexed array A consisting of N integers is given. 
 * Rotation of the array means that each element is shifted right by one index, 
 * and the last element of the array is also moved to the first place.
 * 
 * For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. 
 * The goal is to rotate array A K times; 
 * that is, each element of A will be shifted to the right by K indexes.
 * 
 * Write a function:
 * 
 * class Solution { public int[] solution(int[] A, int K); }
 * that, given a zero-indexed array A consisting of N integers 
 * and an integer K, returns the array A rotated K times.
 * 
 * For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].
 * 
 * Assume that:
 * 
 * N and K are integers within the range [0..100];
 * each element of array A is an integer within the range [−1,000..1,000].
 * In your solution, focus on correctness. 
 * The performance of your solution will not be the focus of the assessment.
 * 
 * Copyright 2009–2016 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 * */

public class CyclicRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testarray = {3, 8, 9, 7, 6};
		int[] result = null;
		int move = 3;
		result = solution(testarray, move);
		for(int i=0; i<result.length;i++) {
			System.out.printf( " - " + result[i]);
		}
	}
	
	public static int[] solution(int[] A, int K){
		
		int temp = 0;
		int cnt = K;
		
		if(A == null || A.length < 2 || K <= 0) {
			return A;
		}
		
		while( cnt > 0 ){
			temp = A[A.length-1];
			for(int i=A.length-1; i >0 ; i--) {
				A[i] = A[i-1];
				
			}
			A[0] = temp;
			cnt--; 
		}
		
		return A;
		
	}

}
