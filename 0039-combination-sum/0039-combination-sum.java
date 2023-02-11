class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> list = new ArrayList<>();
        helper(candidates, list, new ArrayList<>(), target, 0);
        return list;
    }
    
    private void helper(int[] candidates, List<List<Integer>> list , List<Integer> tmp, int target, int i){
        if(target < 0)  return;
        else if(target == 0)    list.add(new ArrayList<>(tmp));
        else{
            while(i<candidates.length){
                tmp.add(candidates[i]);
                helper(candidates, list, tmp, target - candidates[i], i++);
                tmp.remove(tmp.size()-1);
            }
        }
    }
}