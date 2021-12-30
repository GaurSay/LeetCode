class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int high  = matrix.length-1;
        int pot_row = -1;
        while(low<=high){
            
            int mid = (low+high)/2;
            
            if(matrix[mid][0] > target){
                high = mid-1;
            }
            else if(matrix[mid][matrix[0].length-1] < target){
                low = mid+1;
            }
            else{
                pot_row = mid;
                break;
            }
        }
         // System.out.println(pot_row);
        low = 0;
        high = matrix[0].length-1;
        if(pot_row == -1){
            return false;
        }
        while(low<=high){
            int mid = (low+high)/2;
            if(matrix[pot_row][mid] > target){
                high = mid-1;
            }
            else if(matrix[pot_row][mid] < target){
                low = mid+1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}