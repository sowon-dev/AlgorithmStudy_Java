package hackerrank;

public class TimeConversion {
  static String timeConversion(String s) {

    int timeInt = Integer.parseInt(s.substring(0, 2));
    String format = s.substring(s.length()-2);
    if(timeInt == 12 && format.equals("AM")){
      timeInt = 0;
    }else if(timeInt != 12 &&format.equals("PM")){
      timeInt += 12;
    }

    String timeString = String.valueOf(timeInt).length() == 1 ? "0"+timeInt : String.valueOf(timeInt);
    return timeString + s.substring(2,s.length()-2);
  }

  public static void main(String[] args) {
    System.out.println(timeConversion("07:05:45PM")+", ans: 19:05:45");
    System.out.println(timeConversion("12:01:00PM")+", ans: 12:01:00");
    System.out.println(timeConversion("12:01:00AM")+", ans: 00:01:00");
  }
}
