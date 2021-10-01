import java.util.*;

public class Solution {

    public int[] solution(String[] operations) {
        int[] answer = new int[2];

        PriorityQueue<Integer> pq = new PriorityQueue<>();  //오름차순
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());  //내림차순
        
        for (String o : operations) {
            
            if (o.substring(0,1).equals("I")) {
                int value = Integer.valueOf(o.substring(2));     
                pq.offer(value);
                maxPq.offer(value);          
            }          
           
            else if (!pq.isEmpty()) {
                //최대값 삭제
                if (o.equals("D 1")) {
                    int value = maxPq.poll();
                    pq.remove(value);
                }
                //최소값 삭제
                else if (o.equals("D -1")) {
                    int value = pq.poll();
                    maxPq.remove(value);       
                }
            }            
        }

        if (!pq.isEmpty()) {
            answer[0] = maxPq.peek();
            answer[1] = pq.peek();
        }

        return answer;
	    }
	}﻿​
