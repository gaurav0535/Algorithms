package Imp;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums1 = {4,9,5,4,6,8,1,2};
		int[] nums2 = {9,4,9,8,4,2};
		int[] intersection= {};
		int nums1_length = nums1.length;
		int nums2_length = nums2.length;
		int[] result= {};
		 //ArrayList<int> myList = new ArrayList<int>(Arrays.asList(result));
		for(int i=0;i<nums1_length;i++)
		{
			for(int j=0;j<nums2_length;j++)
			{
				if(nums1[i]==nums2[j])
				{
				//	intersection
					System.out.println(nums1[i]);
					break;
				}
			}
		}
		
	
		
	}

}
