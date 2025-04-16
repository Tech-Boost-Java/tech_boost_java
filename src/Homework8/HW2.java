package Homework8;

public class HW2 {
    public static String isSmth(String s){
        String pattern = "\\d{2}\\.\\d{2}\\.\\d{2}";

        if(s.matches(pattern)) {
            String[] parts = s.split("\\.");
            int day = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);

            if((day >=1 && day <=31) && (month >= 1 && month <= 12) && (year >= 10 && year <= 99)) {
                return s;
            }
            else {
                return "wrond data";
            }
        }
        else {
            return "wrong data";
        }
    }

    public static void main(String[] args) {
        String data = "12.13.25";
        System.out.println(isSmth(data));
    }
}
