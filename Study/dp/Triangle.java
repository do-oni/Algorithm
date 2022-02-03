package main.java.algorithm.Study.dp;
///https://programmers.co.kr/learn/courses/30/lessons/43105

public class Triangle {
    public static int solution(int[][] triangle) {

        for (int i = triangle.length - 2; i >= 0; i--) { // Bottom-Up
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] += Math.max(triangle[i + 1][j], triangle[i + 1][j + 1]);
            }
        }
        return triangle[0][0];
    }
}

//stream을 사용한 풀이
//import java.util.*;
//
//class Solution {
//    public int solution(int[][] triangle) {
//        for (int i = 1; i < triangle.length; i++) {
//            triangle[i][0] += triangle[i-1][0];
//            triangle[i][i] += triangle[i-1][i-1];
//            for (int j = 1; j < i; j++)
//                triangle[i][j] += Math.max(triangle[i-1][j-1], triangle[i-1][j]);
//        }
//
//        return Arrays.stream(triangle[triangle.length-1]).max().getAsInt();
//    }
//}

