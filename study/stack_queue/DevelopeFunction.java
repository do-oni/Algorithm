package main.java.algorithm.Study.stack_queue;
//https://programmers.co.kr/learn/courses/30/lessons/42586

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DevelopeFunction {
    public static void main(String[] args) {

//			public int[] solution(int[] progresses, int[] speeds) {
//				int[] progresses = {93, 30, 55};  //test1
        int[] progresses = {95, 90, 99, 99, 80, 99};  //test2
//				int[] speeds = {1, 30, 5};  //test1
        int[] speeds = {1, 1, 1, 1, 1, 1};  //test2
        int[] answer = {};

        ArrayList<Integer> days = new ArrayList<>();
        Queue<Integer> prog = new LinkedList<>();
        Queue<Integer> sp = new LinkedList<>();

        //	        for(int i=0;i<progresses.length;i++)
        for (int i : progresses)
            prog.add(i);
//		        for(int i=0;i<speeds.length;i++)
        for (int i : speeds)
            sp.add(i);
        int day = 1;
        while (!prog.isEmpty()) {
            int count = 0;
            while (prog.peek() + (sp.peek() * day) < 100)
                day++;
            while (!prog.isEmpty() && prog.peek() + (sp.peek() * day) >= 100) {
                prog.remove();
                sp.remove();
                count++;
            }
            if (count > 0) days.add(count);
        }
        System.out.println(days);  //=answer
        answer = new int[days.size()];
        for (int i = 0; i < days.size(); i++) answer[i] = days.get(i);
//		        return answer;
        System.out.println(Arrays.toString(answer));
    }
}
