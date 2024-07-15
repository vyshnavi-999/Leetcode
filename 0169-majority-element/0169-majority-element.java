class Solution {
    public int majorityElement(int[] nums) {
     int c=0;
     int can=0;
     for(int num: nums){
        if(c==0){
            can=num;
        }
        if(can==num){
            c++;
        }
        else{
            c--;
        }
     }
     c=0;
     for(int num:nums){
        if(can==num){
            c++;
        }
     }
     return can;
 
}
}