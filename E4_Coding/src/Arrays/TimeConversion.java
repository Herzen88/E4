package Arrays;

public class TimeConversion {
    public static void main(String[] args) {
        String inputTime = "12:45:54PM";
        System.out.println(convertTime(inputTime));
    }

    static String convertTime(String input) {
        String dayNightId;
        String[] ar;
        dayNightId = input.substring(input.length() - 2, input.length());
        input = input.replace(dayNightId, "");
        ar = input.split(":");
        if (dayNightId.equals("PM")) {
            if (!ar[0].equals("12")) ar[0] = String.valueOf(Integer.valueOf(ar[0]) + 12);
            else {
                ar[0] = "12";
            }
        } else {
            if (ar[0].equals("12")) ar[0] = "00";
        }
        return String.join(":", ar);
    }
}
