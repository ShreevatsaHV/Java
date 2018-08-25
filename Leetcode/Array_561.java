package array.probs;

import java.util.Arrays;

public class Array_561 {
	 public static int arrayPairSum(int[] nums) {
	        Arrays.sort(nums);
	        int result = 0;
	        for (int i = 0; i < nums.length; i += 2) {
	            result += nums[i];
	        }
	        return result;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] A = {-1,3,4,2};
		System.out.println(arrayPairSum(A));
	}

}
