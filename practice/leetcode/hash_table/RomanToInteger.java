package main.java.algorithm.practice.leetcode.hash_table;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char roman = s.charAt(i);
            if (i > 0 && romanMap.get(roman) > romanMap.get(s.charAt(i - 1))) {
                result += romanMap.get(roman) - 2 * romanMap.get(s.charAt(i - 1));
            } else {
                result += romanMap.get(roman);
            }
        }
        return result;
    }
}
