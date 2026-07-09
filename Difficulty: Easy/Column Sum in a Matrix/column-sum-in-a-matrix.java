class Solution {
    public static int[] colSum(int mat[][]) {
        // Code Here
        int[] result = new int[mat[0].length];
        for (int j = 0;j<mat[0].length;j++){
            int sum =0;
            for (int i=0;i<mat.length;i++){
                sum +=mat[i][j];
            }
        
            result[j] = sum;
        }
        return result;
    }
}