class Solution {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) return true;
        int n = nums.length;
        int lastPos = n - 1;
        for (int i = lastPos; i >= 0; i--) {  //가장 마지막부터 0이 될 때까지
            if (i + nums[i] >= lastPos) lastPos = i; //i와 배열의 숫자가 lastPose보다 같거나 크다면, lastPos를 i로 변경,,
        }
        return lastPos == 0;
    }
}