package main.java.algorithm.practice.leetcode.string;

public class LongestCommonPrefix {

    // 이중 for문 풀이
    // Runtime: 1ms, Memory Usage: 40mb
    public static String longestCommonPrefix1(String[] strs) {
        if (strs.length == 0) return "";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            for (String str : strs) {
                if (str.length() <= i || c != str.charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }

    // indexOf()를 사용한 풀이
    // strs[0]과 비교하여 같지 않으면 마지막 char를 지워나가는 방식
    // Runtime: 1ms, Memory Usage: 42mb
    public String longestCommonPrefix2(String[] strs) {
        String result = "";
        if (strs.length == 0) return result;
        result = strs[0];

        for (int i = 1; i < strs.length; i++) {
            String cur = strs[i];
            while (cur.indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
            }
        }
        return result;
    }

}
