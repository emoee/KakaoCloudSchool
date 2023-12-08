package mycom.dept.control;

import java.util.ArrayList;
import java.util.Collections;

public class Control02 {

	public static void main(String[] args) {
		// for
		int[] nums = {10,23,45,676,543,345,5,43,244};
		
		// "��ü �հ� ����Ѵ�."
		int sum = 0;
		for (int i=0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.println("�հ� : " + sum);
		
		// for each
		// "¦�� �����͸� ����Ѵ�."
		for (int num:nums) {
			if (num%2==1) {
				System.out.println("Ȧ�� : " +num);
			}
		}
		
		// "��� �� ����Ѵ�."
		float avg = sum/nums.length;
		System.out.println("��� : " + avg);
		
		
		// "5�� ����� �����͸� ����Ѵ�."
		for (int num:nums) {
			if (num%5==0) {
				System.out.println("5�� ��� : " +num);
			}
		}
		
		// "������� ������ ��, 1/4, 2/4, 3/4 ���� �� ���"
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
