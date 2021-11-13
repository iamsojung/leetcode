import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        
    //   Integer[] arr3 = Arrays.stream(nums).boxed().toArray(Integer[]::new);
     //   Arrays.sort(arr3, Collections.reverseOrder());
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}