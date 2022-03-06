package com.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {


	}


	public static int[] twoSum(int[] nums, int target) {
		int[] res = {-1,-1};
		Map<Integer,Integer> numMap = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			if(numMap.containsKey(target - nums[i] )) {
				res[0] = numMap.get(target - nums[i]);
				res[1] = i;
				break;
			}
			numMap.put(nums[i], i);
		}		
		return res;
	}

}
