class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[i]){
                    int t=nums[j];
                    nums[j]=nums[i];
                    nums[i]=t;
                }
            }
        }
    }
}
