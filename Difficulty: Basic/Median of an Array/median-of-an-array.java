class Solution {
    public double findMedian(int[] arr) {
        int len = arr.length;
        Arrays.sort(arr);
        double median =0;
        if (len%2 !=0){
         median = arr[len/2];
        }
        else {
             int m1= arr[len/2];
             int m2 = arr[(len/2)-1];
            median =(double) (m1+m2)/2;
        }
        
        return median;
        // Code here.
    }
}
