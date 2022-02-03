package main.java.algorithm.Study.a_study;
//https://www.acmicpc.net/problem/8983 사냥꾼

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B8983 {

    static int m;  //사대의 수
    static int n;  //동물의 수
    static int l;  //사정거리
    static int[] mPos;  //사대 좌표
    static ArrayList<Animals> animals;  //동물들의 좌표

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());  //사대의 수
        n = Integer.parseInt(st.nextToken());  //동물의 수
        l = Integer.parseInt(st.nextToken());  //사정거리

        //사대 정보
        mPos = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            mPos[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(mPos);

        //동물 정보
        animals = new ArrayList<Animals>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int col = Integer.parseInt(st.nextToken());
            int row = Integer.parseInt(st.nextToken());
            animals.add(new Animals(row, col));
        }

        int ret = process();
        System.out.println(ret);
    }

    private static int process() {
        int ret = 0;

        for (int i = 0; i < n; i++) {
            ret += search(i);
        }

        return ret;
    }

    //이분 탐색
    private static int search(int idx) {

        int left = 0;
        int right = m;
        int mid = 0;

        while (left <= right) {
            mid = (left + right) / 2;
            //범위 초과
            if (mid >= m) {
                return 0;
            }

            //사정거리
            int dist = getDis(mPos[mid], animals.get(idx));

            //사정거리가 오른쪽 밖에 있을 경우
            if (l < dist && animals.get(idx).col < mPos[mid]) {
                right = mid - 1;
            }

            //사정거리가 왼쪽 밖에 있을 경우
            else if (l < dist && animals.get(idx).col >= mPos[mid]) {
                left = mid + 1;
            }
            //사정거리 안에 들어올 경우
            else if (l >= dist) {
                return 1;
            }
        }

        return 0;
    }

    //사격 범위에 포함 판단
    private static int getDis(int x, Animals animal) {
        return (Math.abs(x - animal.col) + animal.row);
    }

}

class Animals {
    int row;
    int col;

    public Animals(int row, int col) {
        this.row = row;
        this.col = col;
    }
}
