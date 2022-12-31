/*
1389. Create Target Array in the Given Order

Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]

*/
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<index.length;i++)
        
            list.add(index[i],nums[i]);
        
        int res[]=new int[nums.length];
        for(int i=0;i<list.size();i++)
        
            res[i]=list.get(i);
        
        return res;
    }
}