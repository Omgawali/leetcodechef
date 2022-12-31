/*
1732. Find the Highest Altitude


Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
*/
class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int current=0;

        for(int i=0;i<gain.length;i++){
            current +=gain[i];
            max=Math.max(current,max);
        }
        return max;
    }
}