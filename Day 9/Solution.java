class Solution {
    public boolean isPerfectSquare(int num) 
    {
        //use search answer based on binary search for this question
        int l=1;
        int h=num/2;
        if(num==1)
            return true;
        while(l<=h)
        {
            
            int mid=l+(h-l)/2;
            //System.out.println(mid*mid);
            if(mid==(float)num/mid)
                return true;
            else if(mid>(float)num/mid)
            {
                h=mid-1;
            }
            else
                l=mid+1;
        }
        return false;
    }
}