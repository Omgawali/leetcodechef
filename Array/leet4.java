/*
1431. Kids With the Greatest Number of Candies

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true] 
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.

*/

import java.lang.*
import java.util.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
        int n = candies.length;
        List result = new ArrayList<>();
        int maxcandy =0;
        for(int i = 0 ; i<n; i++)
        {
        maxcandy = Math.max(maxcandy,candies[i]);
        }
        for(int i = 0; i<n; i++)
        {
        if((candies[i] + extraCandies) >= maxcandy)
        result.add(i, true);
        else
        result.add(i,false); 
        }
        return result;
    }
}
