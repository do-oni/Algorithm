package main.java.algorithm.Study.stack_queue;
//https://programmers.co.kr/learn/courses/30/lessons/42583

import java.util.LinkedList;
import java.util.Queue;

public class CrossingBridgeTruck {
    public static void main(String[] args) {
//	    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};
        int answer = 0;
        int count = 0, bridge_weight = 0;

        Queue<Integer> cross = new LinkedList<>();

        // 다리 무게 = 트럭 무게
        while (true) {
            if (cross.size() == bridge_length) {
                bridge_weight -= cross.poll();
            } else if (bridge_weight + truck_weights[count] > weight) {
                cross.offer(0);
                answer++;
            } else {
                cross.offer(truck_weights[count]);
                bridge_weight += truck_weights[count];
                answer++;
                count++;
            }
            if (count == truck_weights.length)
                break;
        }

//	        return answer + bridge_length;
        System.out.println(answer + bridge_length);
    }
}

