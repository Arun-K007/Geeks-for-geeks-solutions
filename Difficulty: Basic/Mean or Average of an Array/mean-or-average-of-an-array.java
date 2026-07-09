class Solution {
    public static int findMean(int[] arr) {
        // code here
        int total=0;
        int numberofelements=arr.length;
        for (int i =0;i<arr.length;i++){
            total=total+arr[i];
        }
        int avg=(total/numberofelements);
        return avg;
    }
}