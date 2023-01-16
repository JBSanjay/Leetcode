/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1,h = n;
        int res = 0;
        while(l <= h)
        {
            int mid = l + (h-l)/2 ;
            if(isBadVersion(mid))
            {
                res = mid;
                h = mid-1;
            }
            else    l = mid+1;
        }
        return res;
    }
}