import java.util.HashMap;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, String> hm = new HashMap<>();
		for(String num : phone_book) {
			hm.put(num, num);
		}
		for (String num : phone_book) {
			for(int i=0; i<num.length(); i++) {
				if(hm.containsKey(num.substring(0,i))) {
					return false;
				}
			}	
		}
        return answer;
    }
}
