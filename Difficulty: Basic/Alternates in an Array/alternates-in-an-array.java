class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> lst= new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            if(i%2 ==0){
                lst.add(arr[i]);
            }
        }
        
    return lst;
    }
}