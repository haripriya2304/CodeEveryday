class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int water=0;
        int leftmax=0;
        int rightmax=0;
        while(left<right){
            if(height[left]<=height[right]){
                if(height[left]>=leftmax){
                    leftmax=height[left];
                }
                else{
                    water=water+leftmax-height[left];
                }
                left++;
            }
            else{
                if(height[right]>=rightmax){
                    rightmax=height[right];
                }
                else{
                    water=water+rightmax-height[right];
                }
                right--;
            }
        }
        return water;
    }
}
