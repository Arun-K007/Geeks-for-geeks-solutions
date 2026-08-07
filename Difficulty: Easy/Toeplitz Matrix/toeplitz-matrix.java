class Solution {
    // boolean check(int i,int j,int [][]mat){
    //     while(i<mat.length -1 && j<mat[0].length-1){
    //         if(mat[i][j] != mat[i+1][j+1]){
    //             return false;
    //         }
            
    //     }
    //     return true;
    // }
    public boolean isToeplitz(int[][] mat) {
        // code here
        for(int i =0 ;i <mat.length-1;i++){
            for (int j = 0 ;j<mat[0].length-1;j++){
                  if(mat[i][j] != mat[i+1][j+1]){
                return false;
            }
            }
        }
        return true;
    }
}


