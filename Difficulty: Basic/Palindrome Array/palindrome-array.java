class Solution {
    public static boolean isPalindrome(int[] arr) {
        int[] rev= new int[arr.length];
        for(int i=0;i<arr.length;i++ )
            rev[i] = arr[arr.length -1-i];
            
        return Arrays.equals(arr,rev);
    }
}
