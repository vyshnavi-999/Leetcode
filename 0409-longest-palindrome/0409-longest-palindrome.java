class Solution {
    
    public int longestPalindrome(String s) {
        int[] charac= new int[128];
        for(char c:s.toCharArray()){
            charac[c]++;
        }
        int res=0;
        for(int i:charac){
            res=res+i/2*2;
        }
        if(res<s.length()){
            res=res+1;
        }
        return res;
    }
}