package main.java.algorithm.Study.a_study;
//https://programmers.co.kr/learn/courses/30/lessons/42861 섬 연결하기

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class LinkingIsland {

    public static void main(String[] args) {
        int n = 4;
        int costs[][] = {{0, 1, 1}, {0, 2, 2}, {1, 2, 5}, {1, 3, 1}, {2, 3, 8}};
        int result = solution(n, costs);
        System.out.println(result);
    }

    public static int parent[];  //부모 정점 배열

    public static int solution(int n, int[][] costs) {
        int answer = 0;
        parent = new int[n];
        List<Info> list = new ArrayList<>();

        for (int i = 0; i < costs.length; i++) {
            int start = costs[i][0];
            int end = costs[i][1];
            int cost = costs[i][2];
            list.add(new Info(start, end, cost));
        }

        Collections.sort(list);  //가중치가 작은 값 순으로 정렬 [[start: 0, end: 1, cost: 1], [start: 1, end: 3, cost: 1], [start: 0, end: 2, cost: 2], [start: 1, end: 2, cost: 5], [start: 2, end: 3, cost: 8]]
//		System.out.println(list);

        for (int i = 0; i < n; i++) {
            parent[i] = i;  //부모 배열 값 초기화
        }

        for (int i = 0; i < list.size(); i++) {
            int start = list.get(i).start;
            int end = list.get(i).end;
            start = findSet(start);
            end = findSet(end);

            if (start != end) {  //두 정점이 연결되어 있지 않다면 연결 하기
                answer += list.get(i).cost;
                unionSet(start, end);
            }
        }
        return answer;
    }

    public static int findSet(int x) {

        if (parent[x] == x) return x;  //해당 부모 정점의 값과 같다면 이미 최종 부모 정점이라 판단

        else return findSet(parent[x]);  //그렇지 않을 때 최종 부모 정점까지 탐색
//			int p = findSet(parent[x]);
//			return parent[x] = findSet(parent[x]);

    }

    public static void unionSet(int x, int y) {
        x = findSet(x);
        y = findSet(y);
//		if (x != y) {
//			parent[y] = x;
//		}
        if (x > y) parent[x] = y;  //부모가 작은 쪽으로 합치기

        else parent[y] = x;
    }

    public static class Info implements Comparable<Info> {
        int start;
        int end;
        int cost;

        Info(int start, int end, int cost) {
            this.start = start;
            this.end = end;
            this.cost = cost;
        }

        @Override
        public int compareTo(Info o) {
            return this.cost - o.cost;
        }

        @Override
        public String toString() {
            return "[start: " + start + ", end: " + end + ", cost: " + cost + "]";
        }
    }
}
