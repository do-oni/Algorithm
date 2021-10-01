import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

class Solution { 
    public int[] solution(int[] progresses, int[] speeds) {

        int[] answer = {}; 

        ArrayList<Integer> days = new ArrayList<>(); 
        Queue<Integer> prog = new LinkedList<>(); 
        Queue<Integer> sp = new LinkedList<>(); 

        for(int i=0;i<progresses.length;i++) 
            prog.add(progresses[i]); 
        for(int i=0;i<speeds.length;i++) 
            sp.add(speeds[i]); 
        int day = 1; 
        while(!prog.isEmpty()){ 
            int count = 0; 
            while(prog.peek() + (sp.peek() * day) < 100) 
                day++; 
            while (!prog.isEmpty() && prog.peek() + (sp.peek() * day) >= 100){ 
                prog.remove(); 
                sp.remove(); 
                count++; 
            } 
            if(count > 0) days.add(count); 
        } 
        answer = new int[days.size()]; 
        for(int i = 0; i < days.size(); i++) answer[i] = days.get(i); 
        return answer; 
    } 
}
