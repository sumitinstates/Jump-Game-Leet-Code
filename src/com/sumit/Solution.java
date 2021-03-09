package com.sumit;

public class Solution {
	
    public static boolean canJump(int[] nums) {
        
        int longestReachPath = 0;
        int length = nums.length;
        
        if(nums.length==0 || nums == null)
        {
            return false;
        }
        
        for(int i=0;i<nums.length;i++)
        {
           if(i>longestReachPath || longestReachPath>=length-1) 
           {
               break;
           }
           else
           {
               longestReachPath = Math.max(longestReachPath,i+nums[i]);       
           }
        }
         
        return longestReachPath>=length-1;
        
    }
    
    public static void main(String[] args) {
		int[] nums1 = {2,3,1,1,4};
		int[] nums2 = {3,2,1,0,4};
		
		System.out.println(Solution.canJump(nums1));
		
		System.out.println(Solution.canJump(nums2));
		
	}

}
