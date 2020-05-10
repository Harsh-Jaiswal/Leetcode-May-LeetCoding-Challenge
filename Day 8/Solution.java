class Solution {
    public boolean checkStraightLine(int[][] coordinates) 
    {
        int prev_point[]=new int[2];
        int i=0;
        int prev_num=0;
        int prev_den=0;
        for(int point[]:coordinates)
        {
            if(i>0)
            {
                int num=point[0]-prev_point[0];
                int den=point[1]-prev_point[1];
                int lcm=gcd(num,den);
                if(i>1)
                {
                    if(num/lcm!=prev_num || den/lcm!=prev_den)
                    {
                        return false;
                    }
                }
                prev_den=den/lcm;
                prev_num=num/lcm;
            }
            i++;
            prev_point=point;
        }
        return true;
    }
    public int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}