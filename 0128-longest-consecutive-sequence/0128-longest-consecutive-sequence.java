import java.util.HashSet;
import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        int len=nums.length;
        Set<Integer> hj=new HashSet<Integer>();
        for(int j:nums)
        {
        hj.add(j);
        // System.out.print(j);
        }
        int scount=0;
        for(int i:nums)
        {
            // int tmp=0;
            if(!hj.contains(i-1))
            {
                 int tmp=1;
                while(hj.contains(i+tmp))
                {
                    tmp++;
                }
                // System.out.print("hello");
            scount=Math.max(scount,tmp);
            }
        }
        return scount;
    }
}