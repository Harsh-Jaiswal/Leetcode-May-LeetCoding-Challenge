class Solution {
    public int firstUniqChar(String s) {
        boolean[] repeated = new boolean[26];
        boolean[] seen = new boolean[26];
        char[] chars = s.toCharArray();
        int i;
        int N = chars.length;
        
        for(i = 0; i < N; i++){
            if(seen[chars[i] - 'a'])
                repeated[chars[i] - 'a'] = true;
            else
                seen[chars[i] - 'a'] = true;
        }
        
        for(i = 0; i < N; i++){
            if(!repeated[chars[i] - 'a'])
                return i;
        }
        
        return -1;
    }
}