import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class Solution { 
	public int solution(int N, int number) { 
		int answer = -1; 
		List<Set<Integer>> list = new ArrayList<>(); 
		for (int i = 0 ; i < 8; i++) { 
			list.add(new HashSet<>()); 
			} list.get(0).add(N); 

			for (int i = 0; i < 8; i++) { 
				list.get(i).add(Integer.parseInt(stringRepeat(N, i + 1))); 
				for (int j = 0; j < i; j++) { 
					for (int case1 : list.get(j)) { 
						for (int case2 : list.get(i - 1 - j)) { 
							list.get(i).add(case1 + case2); 
							list.get(i).add(case1 - case2); 
							list.get(i).add(case1 * case2); 
							if (case2 != 0) { 
								list.get(i).add(case1 / case2); 
								} 
							} 
						} 
					} 
				if (list.get(i).contains(number)) { 
					answer = i + 1; 
					break; 
					} 
				} 
			return answer; 
			} 
	private String stringRepeat(int N, int times) { 
		StringBuilder answer = new StringBuilder(); 
		String str = String.valueOf(N); 
		answer.append(str.repeat(Math.max(0, times))); 
		return answer.toString(); 
		} 
	}
