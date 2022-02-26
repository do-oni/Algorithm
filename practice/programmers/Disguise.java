package main.java.algorithm.practice.programmers;

import java.util.Arrays;

import static java.util.stream.Collectors.*;

public class Disguise {

    public int solution(String[][] clothes) {

        return Arrays.stream(clothes)
                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
                .values()
                .stream().reduce(1L, (x, y) -> x * (y + 1)).intValue() - 1;

    }

}
