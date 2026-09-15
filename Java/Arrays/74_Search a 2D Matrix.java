class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        int c=matrix[0].length;
        int m=0,n=r-1;
        while(m<=n){
            int mid1=(m+n)/2;
            int x=0,y=c-1;
            while(x<=y){
                int mid2=(x+y)/2;
                if(matrix[mid1][mid2]==target) return true;
                else if(matrix[mid1][mid2]<target) x=mid2+1;
                else y=mid2-1;
            }
            if(matrix[mid1][0]<target) m=mid1+1;
            else n=mid1-1;
        }
        return false;
    }
}
