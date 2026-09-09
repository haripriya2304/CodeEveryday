class Solution {
    public int[] getAverages(int[] nums, int k) {
        int arr[]=new int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=-1;
        }
        int wsize=2*k+1;
        if(wsize>nums.length){
            return arr;
        }
        long sum=0;
        for(int i=0;i<wsize;i++){
            sum+=nums[i];
        }
        arr[k]=(int)(sum/wsize);
        for(int i=wsize;i<nums.length;i++){
            sum=sum+nums[i]-nums[i-wsize];
            arr[++k]=(int)(sum/wsize);
        }
        return arr;
    }
}
