class Solution {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) return true;
        int n = nums.length, lastPos = n - 1;
        for (int i = lastPos; i >= 0; i--) { 
            if (i + nums[i] >= lastPos) lastPos = i;
        }
        return lastPos == 0;
    }
}