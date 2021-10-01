import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int answer = 0;
        
        for(int i : scoville) {
            pq.add(i);
        }
        
        while(pq.peek() <= K) {
            if(pq.size() == 1) {
                return -1;
            }
            int first = pq.poll();
            int second = pq.poll();
            
            int k = first + (second * 2);
            pq.add(k);
            answer++;
        }
        return answer;
    }
}
