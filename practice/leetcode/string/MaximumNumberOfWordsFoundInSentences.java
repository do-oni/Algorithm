package main.java.algorithm.practice.leetcode.string;

public class MaximumNumberOfWordsFoundInSentences {

    public int mostWordsFound(String[] sentences) {
        int cnt = 0;

        for (int i = 0; i < sentences.length; i++) {
            cnt = Math.max(cnt, sentences[i].split(" ").length);
        }

        return cnt;
    }

}
