package main.java.algorithm.practice.codility;

import java.util.ArrayList;
import java.util.HashSet;

public class OddOccurrencesInArray {

    public int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i<A.length; i++) {
            if (hs.contains(A[i])) hs.remove(A[i]);
            else hs.add(A[i]);
        }

        ArrayList<Integer> arrList = new ArrayList<>(hs);
        int answer = arrList.get(0);

        return answer;
    }

}
