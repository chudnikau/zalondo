package com.chudnikau.transformedstr;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        assertEquals(solution.solution("CBACD").equals("C"));
    }

    static void assertEquals(Boolean b) {
        if (!b) throw new RuntimeException();
    }
}
