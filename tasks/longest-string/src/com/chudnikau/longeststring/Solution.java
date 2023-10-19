package com.chudnikau.longeststring;

import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;

public class Solution {

    public String solution(int AA, int AB, int BB) {
        // Implement your solution here
        if (AA < 0 || AA > 10) throw new RuntimeException();
        if (AB < 0 || AB > 10) throw new RuntimeException();
        if (BB < 0 || BB > 10) throw new RuntimeException();

        String s1 = findSolution("AA", AA, AB, BB);
        String s2 = findSolution("AB", AA, AB, BB);
        String s3 = findSolution("BB", AA, AB, BB);

        String resStr = Stream.of(s1, s2, s3)
                .max(Comparator.comparingInt(String::length))
                .orElse(null);

        if (Objects.isNull(resStr)) throw new RuntimeException();

        return resStr;
    }

    private String findSolution(String initStr, int AA, int AB, int BB) {
        String S = "";
        String lastStr = initStr;
        while (true) {
            String instStr = "";
            switch (lastStr) {
                case "AA":
                    if (BB > 0) {
                        instStr = "BB";
                        BB--;
                    }
                    break;
                case "AB":
                    if (AA > 0) {
                        instStr = "AA";
                        AA--;
                    }
                    if (AB > 0) {
                        instStr = "AB";
                        AB--;
                    }
                    break;
                case "BB":
                    if (AA > 0) {
                        instStr = "AA";
                        AA--;
                    } else {
                        if (AB > 0) {
                            instStr = "AB";
                            AB--;
                        }
                    }
                    break;
            }
            if (instStr.isEmpty()) break;
            S = S + instStr;
            lastStr = instStr;
        }
        return S;
    }
}
