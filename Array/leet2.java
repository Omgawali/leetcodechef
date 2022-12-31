/*1929. Concatenation of Array


Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]

*/
import java.lang.*;
import java.util.*;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[]=new int[2*n];
        for(int i=0;i<n;i++)
        {
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;    }
}


class leet2
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
	
		
		int brr[]=sorhj.getConcatenation(Arr);
		for(int iCnt=0;iCnt<brr.length;iCnt++)
		{
			System.out.println(brr[iCnt]);
		}
			
	}
}