class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        int n = s.length();
        int ans = map.get(s.charAt(n - 1));

        for (int i = n - 2; i >= 0; i--) {
            char curr = s.charAt(i);
            char next = s.charAt(i + 1);

             if (map.get(curr) < map.get(next)) {
                 ans -= map.get(curr);
             }
             else ans += map.get(curr);
        }

        return ans;
    }
}