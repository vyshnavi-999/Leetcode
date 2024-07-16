class Solution {
    public void rotate(int[] nums, int d) {
        int n=nums.length;
        d=d%n;
        reverse(nums,0,n-1);
         reverse(nums,0,d-1);
          reverse(nums,d,n-1);
    }
        private void reverse(int nums[],int s,int e){
            while(s<e){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;
        }}
}
