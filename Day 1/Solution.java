public class Solution extends VersionControl {
    public int firstBadVersion(int n) 
    {
        int h=n;
        int l=1;
        int res=0;
        while(l<=h)
        {
            
            int mid=l+(h-l)/2;
            if(!isBadVersion(mid))
            {
                res=mid;
                l=mid+1;
            }
            else
                h=mid-1;
        }
        return res+1;
    }
}