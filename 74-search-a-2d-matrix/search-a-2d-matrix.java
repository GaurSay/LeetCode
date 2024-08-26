class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int l = 0;
        int h = (rows*cols)-1;

        while(l<=h){
            int mid = (l+h)/2;
            int r = mid / cols;
            int c = mid % cols;
            if(matrix[r][c] == target){
                return true;
            }
            else if(matrix[r][c] > target){
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return false;
    }
}