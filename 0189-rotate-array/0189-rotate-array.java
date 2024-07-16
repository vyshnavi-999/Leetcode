class Solution {
    public void rotate(int[] nums, int d) {
        int n=nums.length;
        
        d=d%n;
        int[] temp=new int[n];
        int k=0;
        for(int i=n-d;i<n;i++){
            temp[k]=nums[i];
          
            k++;
                    }
            for(int i=0;i<n-d;i++){
            temp[k]=nums[i];
        
            k++;
                    }
        for (int i = 0; i < n; i++) {
        nums[i] = temp[i];
    }
}
}
