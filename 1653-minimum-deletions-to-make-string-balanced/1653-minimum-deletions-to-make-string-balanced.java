class Solution {
    public static int minimumDeletions(String s) {

        if (s == null || s.isEmpty()) return 0;

        int countB = 0; 
        int removals = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a') {
                if (countB > 0) { 
                    ++removals;
                    --countB;
                }
            } else {
                ++countB;
            }
        }
       return removals;
}
}