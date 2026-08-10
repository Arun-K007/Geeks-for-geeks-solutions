class Solution {
    public int solve(int b, List<Integer> arr) {
        int p=b;
        for(int x:arr){
            if(x==b){
                b=x*2;
            }
        }
        return b;
    }
}