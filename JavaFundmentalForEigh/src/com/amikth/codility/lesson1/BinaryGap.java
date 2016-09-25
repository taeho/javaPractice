package com.amikth.codility.lesson1;
 
/*
* 특정수를 2진수로 표현할 때 1과 1사이의 0의 갯수가 가장 많은 구간의 0의 갯수
* A binary gap within a positive integer N is any maximal sequence of consecutive zeros 
* that is surrounded by ones at both ends in the binary representation of N.
* For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
* The number 529 has binary representation 1000010001 and contains two binary gaps: 
* one of length 4 and one of length 3. 
* The number 20 has binary representation 10100 and contains one binary gap of length 1. 
* The number 15 has binary representation 1111 and has no binary gaps.
* 
* 
* Write a function:
* 
* class Solution { public int solution(int N); }
* that, given a positive integer N, returns the length of its longest binary gap. 
* The function should return 0 if N doesn't contain a binary gap.
* 
* For example, given N = 1041 the function should return 5, 
* because N has binary representation 10000010001 and so its longest binary gap is of length 5.
* 
* Assume that:
* 
* N is an integer within the range [1..2,147,483,647].
* 
* Complexity:
* 
* expected worst-case time complexity is O(log(N));
* expected worst-case space complexity is O(1).
* Copyright 2009–2016 by Codility Limited. All Rights Reserved. 
* Unauthorized copying, publication or disclosure prohibited. 
* */

public class BinaryGap {
	public static void main(String[] args){ 
		int a = 1041;
		int res = 0;
		
		res = solution(a);
		
		System.out.println("[max== " + res);
	}
	
	public static int solution(int N) {
		int max = 0;
		int cnt = 0;
		//int k=0;
		String result = "";
		result = Integer.toBinaryString(N);
		System.out.println("rr = " + result + " // result.length()= " + result.length());
		for(int i=0; i < result.length(); i++) { 
			//k++;
			if(result.charAt(i) == '0') {
				cnt++; 
				//if( (result.length()  == k ) && (cnt > max)   ) {
				//	max = cnt;
				//} 
			} else {
				if(cnt > max) {
					max = cnt;
				}
				cnt = 0;
			}
		}
		
		return max;
	}
}
