class Solution {

    public boolean magicSquare(int[][] mat) {

        int n = mat.length;

        // Check if all numbers from 1 to n*n are present exactly once
        boolean[] visited = new boolean[n * n + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int value = mat[i][j];

                if (value < 1 || value > n * n)
                    return false;

                if (visited[value])
                    return false;

                visited[value] = true;
            }
        }

        // Calculate sum of first row (target sum)
        int targetSum = 0;
        for (int j = 0; j < n; j++) {
            targetSum += mat[0][j];
        }

        // Check all rows
        for (int i = 0; i < n; i++) {

            int rowSum = 0;

            for (int j = 0; j < n; j++) {
                rowSum += mat[i][j];
            }

            if (rowSum != targetSum)
                return false;
        }

        // Check all columns
        for (int j = 0; j < n; j++) {

            int colSum = 0;

            for (int i = 0; i < n; i++) {
                colSum += mat[i][j];
            }

            if (colSum != targetSum)
                return false;
        }

        // Check main diagonal
        int diagonal1 = 0;

        for (int i = 0; i < n; i++) {
            diagonal1 += mat[i][i];
        }

        if (diagonal1 != targetSum)
            return false;

        // Check secondary diagonal
        int diagonal2 = 0;

        for (int i = 0; i < n; i++) {
            diagonal2 += mat[i][n - 1 - i];
        }

        if (diagonal2 != targetSum)
            return false;

        return true;
    }
}