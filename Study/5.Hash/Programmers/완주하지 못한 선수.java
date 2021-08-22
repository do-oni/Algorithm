import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap();
        for(int i=0; i<participant.length; i++) {
            if(hm.get(participant[i]) == null) {
                hm.put(participant[i], 0);
            }else {
                hm.put(participant[i], hm.get(participant[i])-1);
            }
        } 
        for(int i=0; i<completion.length; i++) {
            hm.put(completion[i], hm.get(completion[i])+1);
        }
        for(String i : hm.keySet()) {
            if(hm.get(i) == 0) {
                answer = i;
                break;
            }
        }        
               return answer;
   }
}
