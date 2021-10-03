import java.util.*;

public class Solution {

	public int solution(int[] priorities, int location) {
	PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	int answer = 0;
	
	for (int i=0; i <priorities.length; i++) {
	    pq.add(priorities[i]);
	}
        
    while (!pq.isEmpty()) {
        for (int i=0; i<priorities.length; i++) {
            if (priorities[i] == pq.peek()) {
                if (i==location) {
                    answer++;
                    return answer;
                }
                pq.poll();
                answer++;
            }
        }
    }
    return answer;
    }
}

//Printer class 풀이
import java.util.*;

public class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Printer> print = new LinkedList<>();

        for (int index = 0; index < priorities.length; index++) {
            print.add(new Printer(index, priorities[index]));
        }

        while(!print.isEmpty()) {
            Boolean isAdd = false;
            Printer comparatorValue = print.poll();

            Iterator<Printer> value = print.iterator();

            while (value.hasNext()) {
                if (value.next().getPriority() > comparatorValue.getPriority()) {
                    print.add(comparatorValue);
                    isAdd = true;
                    break;
                }
            }

            if (!isAdd) {
                answer++;
                if(comparatorValue.getPosition() == location)
                    break;
            }

        }

        return answer;
    }

class Printer {

	private int position;
	private int priority;

	public Printer(int position, int priority) {
		this.position = position;
		this.priority = priority;
	}

	public int getPosition() {
		return position;
	}

	public int getPriority() {
		return priority;
	}
}
}
