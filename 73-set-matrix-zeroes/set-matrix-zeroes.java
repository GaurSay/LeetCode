class Solution {
    public void setZeroes(int[][] matrix) {
         int n = matrix.length;
        int m = matrix[0].length;
        
        // if zero in 1st row/col
        boolean row0 = false;
        boolean col0 = false;
        
        //col
        for(int i=0;i<n;i++){
            if(matrix[i][0]==0){
                col0 = true;
            }
        }
        
        //row
        for(int i=0;i<m;i++){
            if(matrix[0][i]==0){
                row0 = true;
            }
        }
        
        
        // if zero in rest of matrix
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }             
            }
        }
      
        //col
        for(int i=1;i<n;i++){
            if(matrix[i][0]==0){
                for(int j=0;j<m;j++){
                    matrix[i][j] = 0;
                }
            }
        }
        //row
        for(int i=1;i<m;i++){
            if(matrix[0][i]==0){
                for(int j=0;j<n;j++){
                    matrix[j][i] = 0;
                }
            }
        }
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        if(col0){
            for(int i=0;i<n;i++){
                matrix[i][0]=0; 
            }
        }
        
        if(row0){
           for(int i=0;i<m;i++){
                matrix[0][i]=0;
             } 
        }
      
    }
}