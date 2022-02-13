package main.java.algorithm.practice.hacker_rank;

public class TimeConversion {

    public static String timeConversion(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr;
        int time = 12;
        arr = s.split(":");

        if (s.contains("PM")) {

            if (arr[0].equals("12")) {
                arr[0] = "12";
            } else {
                String hour = s.substring(0, 2);
                arr[0] = Integer.toString(Integer.parseInt(hour) + time);
            }

            for (String value : arr) {
                sb.append(value);
                sb.append(":");
            }

        } else if (s.contains("AM")) {

            if (arr[0].equals("12")) {
                arr[0] = "00";
            }

            for (String value : arr) {
                sb.append(value);
                sb.append(":");
            }

        }
        return sb.substring(0, 8).toString();
    }

}
