package main.java.algorithm.Practice.HackerRank;

public class TimeConversion {

    public static String timeConversion(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr;
        int time = 12;

        if (s.contains("PM")) {
            arr = s.split(":");

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
            arr = s.split(":");

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
