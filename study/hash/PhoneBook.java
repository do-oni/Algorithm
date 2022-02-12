package main.java.algorithm.Study.hash;
//https://programmers.co.kr/learn/courses/30/lessons/42577

import java.util.HashMap;

public class PhoneBook {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, String> hm = new HashMap<>();

        for (String num : phone_book) {
            hm.put(num, num);
        }

        for (String num : phone_book) {
            for (int i = 0; i < num.length(); i++) {
                if (hm.containsKey(num.substring(0, i))) {
                    return false;
                }
            }
        }
        return answer;
    }
}