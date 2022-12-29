

/*

Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]]
 for each 0 <= i < nums.length and return it.

A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).

 

Example 1:

Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows: 
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
    = [0,1,2,4,5,3]
	

	
Input: nums = [5,0,1,2,3,4]
Output: [4,5,0,1,2,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
    = [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
    = [4,5,0,1,2,3]
	
	
*/
import java.lang.*;
import java.util.*;

class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans  = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
           
            ans[i] = nums[nums[i]];
        return ans;
    }
}

class leet1
{
	public static void main(String arg[])
	{
		Scanner sobhj=new Scanner(System.in);
		Solution sorhj=new Solution();
		
		System.out.println("Enter no elements :");
		int size=sobhj.nextInt();
		
		int Arr[]=new int[size];
		
		System.out.println("Enter element of array:");
		for(int iCnt=0;iCnt<Arr.length;iCnt++)
		{
			Arr[iCnt]=sobhj.nextInt();
		}
		
		int brr[]=sorhj.buildArray(Arr);
		for(int iCnt=0;iCnt<Arr.length;iCnt++)
		{
			System.out.println(brr[iCnt]);
		}
			
	}
}