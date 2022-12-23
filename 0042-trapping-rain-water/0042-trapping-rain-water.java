class Solution {
    public int trap(int[] height) {
        int len=height.length;
        int left,right,leftmax,rightmax,res;
        left=0;
        right=len-1;
        leftmax=0;
        rightmax=0;
        res=0;
        while(left<=right)
        {
            if(height[left]<=height[right])
            {
                if(height[left]>leftmax)
                {
                    leftmax=height[left];
                }
                else
                {
                    res+=leftmax-height[left];
                }
                left++;
            }
            else
            {
                if(height[right]>rightmax)
                {
                    rightmax=height[right];
                }
                else
                {
                    res+=rightmax-height[right];
                }
                right--;
            }
        }
        return res;
    }
}