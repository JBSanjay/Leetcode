class Solution {
    public int maxSum(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int l=0;
        int[] s=new int[150000];
        for(int row=0;row<r-2;row++)
        {
            for(int col=0;col<c-2;col++)
            {
                   s[l]=grid[row][col]+grid[row][col+1]+grid[row][col+2]+grid[row+1][col+1]+grid[row+2][col]+grid[row+2][col+1]+grid[row+2][col+2];
                l+=1;
            }
        }
        int max=0;
        for(int i=0;i<=l;i++)
        {
            if(s[i]>max)
            {
                max=s[i];
            }
        }
        return max;
    }
}