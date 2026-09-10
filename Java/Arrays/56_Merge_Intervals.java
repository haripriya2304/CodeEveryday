class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(x,y)->x[0]-y[0]);
        List<int[]>list = new ArrayList<>();
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int currentstart=intervals[i][0];
            int currentend=intervals[i][1];
            if(currentstart<=end){
                end=Math.max(currentend,end);
            }
            else{
                int arr[]=new int[]{start,end};
                list.add(arr);
                start=currentstart;
                end=currentend;
            }
        }
        int arr[]=new int[] {start,end};
            list.add(arr);

        return list.toArray(new int[list.size()][]);
        
    }
    
}
