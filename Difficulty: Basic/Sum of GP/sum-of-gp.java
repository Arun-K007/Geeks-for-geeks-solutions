class Solution {
    public int sumOfGP(int n, int a, int r) {
        int fact = a;
        int sum=a;
        for (int i = 1;i<n;i++){
            fact *=r;
            sum+=fact;
        }
        return sum;
           
    }
}