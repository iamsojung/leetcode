class Solution {
    
    static int N =0;
    static int[] answer;
    static boolean[] visited;
    static ArrayList<Integer> ans;
    static List<List<Integer>> arr;
    
    public List<List<Integer>> permute(int[] nums) {

        N = nums.length;
        answer = new int[N];
        visited = new boolean[N];
        arr = new ArrayList<>();
        ans = new ArrayList<>();
        dfs(nums,0);
        
        return arr;
    }

    static public List<List<Integer>> dfs(int[] nums, int index) {

        if(index ==nums.length){
            ans = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ans.add(answer[i]);
            }
            arr.add(new ArrayList(ans));
            return arr;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i])
                continue;
            
            answer[index] = nums[i];
            visited[i]=true;
            dfs(nums,index+1);
            visited[i]=false;
        }
        return arr;
    }
}