class Solution {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        char[] chars = s.toCharArray();
        List<Character> openingBrackets = Arrays.asList('(', '{', '[');
        List<Character> closingBrackets = Arrays.asList(')', '}', ']');

        for (char c : chars) {
            if (openingBrackets.contains(c)) {
                brackets.push(c);
            } else if (closingBrackets.contains(c)) {
                if (brackets.isEmpty()) {
                    return false;
                }

                Character openingBracket = brackets.pop();
                if (closingBrackets.indexOf(c) != openingBrackets.indexOf(openingBracket)) {
                    return false;
                }
            }
        }

        return brackets.isEmpty();
    }
    
}