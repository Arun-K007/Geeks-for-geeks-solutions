

class Solution {
    public int diagonalSum(int[][] mat) {
        // code here
        int sum=0;
        int k=0;
        int m=mat.length -1;
        for (int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i]==mat[j]){
                    sum +=mat[i][j];

                }
                if(i==k && j==m){
                    sum+=mat[i][j];
                    k++;
                    m--;
                }
            }
        }
        return sum;
    }
}