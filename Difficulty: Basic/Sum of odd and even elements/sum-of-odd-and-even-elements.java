class Solution {
    public int[] findSum(int n) {
        // Code here
        int even = 0;
        int odd = 0 ;
        int[] arr  = new int[2];
        for(int i = 0; i<=n;i++){
            if (i%2==0){
                even +=i;
            }
            else{
                odd+=i;
            }
        }
        arr[0]=odd;
        arr[1]=even;
        return arr;
    }
}