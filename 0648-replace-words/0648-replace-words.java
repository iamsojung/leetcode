class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        if (dictionary == null || dictionary.size() == 0) return sentence;
        
        Set<String> set = new HashSet<>();
        for (String s : dictionary) set.add(s);
        
        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split("\\s+");
        
        for (String word : words) {
            String prefix = "";
            for (int i = 1; i <= word.length(); i++) {
                prefix = word.substring(0, i);
                if (set.contains(prefix)) break;
            }
            sb.append(" " + prefix);
        }
        
        return sb.deleteCharAt(0).toString();
    }
    
}