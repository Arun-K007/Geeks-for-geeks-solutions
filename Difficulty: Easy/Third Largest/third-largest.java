class Solution {
    public int thirdLargest(List<Integer> arr) {
        // code here
        int largest =arr.get(0);
        int second=-1;
        int third =-1;
        for(int i = 1;i<arr.size();i++){
            if(arr.get(i)>=largest){
                third = second;
                second= largest;
                largest = arr.get(i);
                
            }
             else if(arr.get(i)>second && arr.get(i)<largest){
                 third =second;
                 second =arr.get(i);
             }
             else if(arr.get(i)>third){
                 third = arr.get(i);
             }
        }
        return third;
    }
}