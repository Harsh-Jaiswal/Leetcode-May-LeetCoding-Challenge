class Solution {
    public int majorityElement(int[] nums) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        if(n==1)
            return nums[0];
        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(nums[i]))
                map.put(nums[i],1);
            else
            {
                int x=map.get(nums[i]);
                x=x+1;
                if(x>n/2)
                    return nums[i];
                map.put(nums[i],x);
            }
        }
        return -1;
    }
    
}