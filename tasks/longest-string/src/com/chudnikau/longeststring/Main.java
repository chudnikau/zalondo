package com.chudnikau.longeststring;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        asserEquals(solution.solution(5, 0, 2).equals("AABBAABBAA"));
        asserEquals(solution.solution(1, 2, 1).equals("AABBABAB"));
        asserEquals(solution.solution(0, 2, 0).equals("ABAB"));
        asserEquals(solution.solution(0, 0, 10).equals("BB"));
    }

    static void asserEquals(boolean b) {
        if (!b) throw new RuntimeException();
    }
}
