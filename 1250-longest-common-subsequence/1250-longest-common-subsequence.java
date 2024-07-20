class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
           int m = text1.length();
        int n = text2.length();
        Integer[][] memo = new Integer[m][n];
        return lcsHelper(text1, text2, m - 1, n - 1, memo);
    }

    private int lcsHelper(String text1, String text2, int i, int j, Integer[][] memo) {
        // Base case: If either string is empty
        if (i < 0 || j < 0) {
            return 0;
        }

        // If the result is already calculated, return it
        if (memo[i][j] != null) {
            return memo[i][j];
        }

        // If characters match, move diagonally
        if (text1.charAt(i) == text2.charAt(j)) {
            memo[i][j] = 1 + lcsHelper(text1, text2, i - 1, j - 1, memo);
        } else {
            // If characters don't match, take the maximum of either removing the character from text1 or text2
            memo[i][j] = Math.max(lcsHelper(text1, text2, i - 1, j, memo), lcsHelper(text1, text2, i, j - 1, memo));
        }

        return memo[i][j];
}}