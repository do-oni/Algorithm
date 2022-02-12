package main.java.algorithm.Study.dijkstra;
//https://programmers.co.kr/learn/courses/30/lessons/12978

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Delivery {

    static int[] dist;  //최단경로 값 저장
    static List<List<Node>> list;  //인접 리스트

    static class Node implements Comparable<Node> {
        private int val;  //정점
        private int cost;  //간선

        public Node(int val, int cost) {
            this.val = val;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }

    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        list = new ArrayList<>();
        dist = new int[N + 1];

        //도로 정보 초기화
        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
            dist[i] = 987654321;
        }

        //양방향 리스트 값 설정
        for (int[] ints : road) {
            list.get(ints[0]).add(new Node(ints[1], ints[2]));
            list.get(ints[1]).add(new Node(ints[0], ints[2]));
        }

        //방문 체크
        boolean[] visited = new boolean[N + 1];
        PriorityQueue<Node> pq = new PriorityQueue<>();
        visited[0] = true;
        dist[1] = 0;  //1번 도시 - 자신 최단 경로 0
        pq.add(new Node(1, 0));

        while (!pq.isEmpty()) {
            int cur = pq.poll().val;

            if (visited[cur]) continue;
            visited[cur] = true;

            for (Node n : list.get(cur)) {
                if (dist[n.val] > dist[cur] + n.cost) {
                    dist[n.val] = dist[cur] + n.cost;
                    pq.add(new Node(n.val, dist[n.val]));
                }
            }
        }

        //K시간 이하로 배달 가능한 지역 개수만큼 answer 늘리기
        for (int i = 1; i < dist.length; i++)
            if (dist[i] <= K)
                answer++;
        return answer;
    }
}
