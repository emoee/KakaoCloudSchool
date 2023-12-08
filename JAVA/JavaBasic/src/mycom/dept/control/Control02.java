package mycom.dept.control;

import java.util.ArrayList;
import java.util.Collections;

public class Control02 {

	public static void main(String[] args) {
		// for
		int[] nums = {10,23,45,676,543,345,5,43,244};
		
		// "전체 합계 출력한다."
		int sum = 0;
		for (int i=0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.println("합계 : " + sum);
		
		// for each
		// "짝수 데이터만 출력한다."
		for (int num:nums) {
			if (num%2==1) {
				System.out.println("홀수 : " +num);
			}
		}
		
		// "평균 값 출력한다."
		float avg = sum/nums.length;
		System.out.println("평균 : " + avg);
		
		
		// "5의 배수인 데이터만 출력한다."
		for (int num:nums) {
			if (num%5==0) {
				System.out.println("5의 배수 : " +num);
			}
		}
		
		// "순서대로 나열한 후, 1/4, 2/4, 3/4 지점 값 찍기"
		ArrayList<Integer> numlist = new ArrayList<>();
		for (int num:nums) {
			numlist.add(num);
		}
		Collections.sort(numlist);
		System.out.println(numlist);
		
		int i = numlist.size()/4;
		for (int j=i; j < numlist.size(); j+=i) {
			System.out.println(numlist.get(j));
		}
	}

}
