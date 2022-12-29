/*1480. Running Sum of 1d Array


Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows:
 [1, 1+2, 1+2+3, 1+2+3+4]
*/

import java.lang.*;
import java.util.*;
class Solution {
    public int[] runningSum(int[] nums) {
        int i = 1;
        int n=nums.length;
        while (i<nums.length){
            nums[i]+=nums[i-1];
            i++;
        }
        return nums;
    }
}


class leet3
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
		
		int brr[]=sorhj.runningSum(Arr);
		for(int iCnt=0;iCnt<brr.length;iCnt++)
		{
			System.out.print(brr[iCnt]);
		}
			
	}
}