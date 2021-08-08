import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String numbers) {
        int answer = 0;
        String[] strArr = numbers.split("");
        int[] intArr = new int[strArr.length];

        for(int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        Set<Integer> set = new HashSet<>();

        for(int i = 1; i <= intArr.length; i++) {
            perm(strArr, 0, i, set);
        }
        answer = set.size();
        return answer;
    }

    public void makePrime(Set set, StringBuilder sb) {
        int num = Integer.parseInt(String.valueOf(sb));
        boolean prime = true;

        if(num <= 1) {
            return;
        }

        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                prime = false;
                break;
            }
        }

        if(prime) {
            set.add(num);
        }
    }

    public void perm(String[] arr, int depth, int k, Set set) {
        if(depth == k) {
            permArr(arr, k, set);
            return;
        }
        else{
            for(int i = depth; i < arr.length; i++) {
                swap(arr, i, depth);
                perm(arr, depth+1, k, set);
                swap(arr, i, depth);
            }
        }
    }
    public void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void permArr(String[] arr, int k, Set set) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < k; i++) {
            sb.append(arr[i]);
        }
        makePrime(set, sb);
    }
}​
