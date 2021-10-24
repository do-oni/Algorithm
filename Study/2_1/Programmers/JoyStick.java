public class Solution {
	
	public int solution(String name) {
		int answer = 0;
		int len = name.length();  //name 길이 저장
		
		//제일 짧은 좌, 우 이동은 맨 오른쪽 이동할 때
		int min = len - 1;
		
		for(int i=0; i<len; i++) {
			char c = name.charAt(i);
			//상하 이동에 대한 조작 횟수가 적은 것으로 선택
			answer += Math.min(c - 'A', 'Z' - c + 1);
			//다음 글자부터 A가 연속으로 나올 때, 어느 방향으로 커서를 이동하는 것이 횟수가 적을지 체크
			int next = i + 1;
			//다음 단어가 A이고, 단어가 끝나기 전까지 next 증가
			while(next < len && name.charAt(next) == 'A') {
				next++;
			}
			//i * 2는 기존 좌우이동 방향을 바꿔 탐색하는 경우
			//첫글자에서 끝까지 오른쪽으로만 이동하는것과 i번까지 오른쪽으로 이동하고 왼쪽으로 이동하여 next까지 이동하는것중 조작 횟수가 적은 것을 선택
			min = Math.min(min, (i * 2) + len - next);
		}
		answer += min;
		return answer;
		
	}
}	
