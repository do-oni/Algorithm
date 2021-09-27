import java.util.Arrays;

public class Solution {

	public static int solution(int n, int[] lost, int[] reserve) {
    	int answer = n - lost.length;  //체육복이 있는 학생 수

	Arrays.sort(reserve);
        Arrays.sort(lost);
        
        //여분 체육복이 도난 당했을 경우
        for(int i=0 ; i<reserve.length ; i++) {
        	for(int j=0 ; j<lost.length ; j++) {
            	if(reserve[i] == lost[j]) {
                    answer++;
                    reserve[i] = -1;   
                    lost[j] = -1;	
				}
			}
		}
	//여분 체육복 빌리기
	for(int i=0 ; i<reserve.length ; i++) {
		for (int j=0 ; j<lost.length; j++) {
			if (Math.abs(reserve[i] - lost[j]) == 1) {
				reserve[i] = -1;
				lost[j] = -1;
				answer++;
				break;
			}
		}
	} 
        return answer;
    }
}
