class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        backtrack(nums, temp, answer, 0);

        return answer;
    }
    
    private void backtrack(int[] nums, List<Integer> temp, List<List<Integer>> answer, int size){

        if(size > nums.length) return;
        answer.add(new ArrayList<>(temp));

        for(int i=size; i<nums.length; i++){
            temp.add(nums[i]);
            backtrack(nums, temp, answer, i+1);
            temp.remove(temp.size()-1);
        }
    }
}