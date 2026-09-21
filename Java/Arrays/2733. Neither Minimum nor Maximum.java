class Solution {
    public int findNonMinOrMax(int[] nums) {
        
        if(nums.length<3){
            return -1;
        }
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int num:nums){
            pq.add(num);

        }
        pq.poll();
        return pq.peek();

    }
}
