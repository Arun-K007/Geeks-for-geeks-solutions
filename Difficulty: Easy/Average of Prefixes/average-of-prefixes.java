class Solution {
    public int[] prefixAvg(int[] arr) {
        // code here
        int[] a = new int[arr.length];
        int[] sumofprefix =new int [arr.length];
        int sum =0;
        int avg = 0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
            sumofprefix[i]=sum;
        }
        for(int i = 0;i<arr.length;i++){
            avg = sumofprefix[i]/(i+1);
            a[i]=avg;
            avg = 0;
        }
        return a;
        }
        
    }