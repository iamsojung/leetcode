class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int count = 0;
        for(int i=0; i<A.length-1; i++){
            if(A[i] < A[i+1]){
                count++;
            }
        }
         
        return count;
    }
}