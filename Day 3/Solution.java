class Solution {
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        int [] arr=new int[256];
        for(char i:magazine.toCharArray())
        {
            arr[i]++;
        }
        for(char i:ransomNote.toCharArray())
        {
            arr[i]--;
            if(arr[i]<0)
                return false;
        }
        return true;
    }
}