package com.chudnikau.transformedstr;

public class Solution {

    public String solution(String S) {
        int i = 0;
        while (i <= S.length()) {
            if (S.contains("AB"))
                S = S.replace("AB", "");
            else if (S.contains("BA"))
                S = S.replace("BA", "");
            else if (S.contains("CD"))
                S = S.replace("CD", "");
            else if (S.contains("DC"))
                S = S.replace("DC", "");
            i++;
        }
        return S;
    }
}
