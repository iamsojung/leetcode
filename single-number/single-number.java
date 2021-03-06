class Solution {
	public static int singleNumber(int[] nums) {
		
		int answer = 0;

		HashMap<Integer, Integer> map = new HashMap<>();
		

		for (int i = 0; i < nums.length; i++) {

			if (!map.containsKey(nums[i])) {				
				map.put(nums[i], 1);
			} else {								
				map.put(nums[i], map.get(nums[i]) + 1);				
			}
		}
		
		Iterator<Integer> keys = map.keySet().iterator(); 
		while(keys.hasNext() ){ 
			
			Integer key = keys.next(); 
			//System.out.println(key+" "+map.get(key));
			
			if (map.get(key) == 1) {
				
				answer = key;
				
				//System.out.println("answer : "+answer);
				
			}
		}
		return answer;
	}
}