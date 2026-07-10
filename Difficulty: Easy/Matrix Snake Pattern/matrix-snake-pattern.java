class Solution {
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        ArrayList<Integer> result =new ArrayList<>();
        for (int i = 0; i < matrix.length; i++){
            if (i%2==0){
            for (int j= 0;j < matrix.length;j++){
                result.add(matrix[i][j]);
            }
            }
            else {
                for (int j = matrix[i].length - 1;j>=0; j--){
                    result.add(matrix[i][j]);
                }
            }
        }
return result;
        
    }
}

