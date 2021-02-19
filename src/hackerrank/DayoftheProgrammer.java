package hackerrank;

public class DayoftheProgrammer {
  static String dayOfProgrammer(int year) {
    //sol 1
		/*
		//율리우스의 윤년
		if(year >= 1700 && year <= 1917 && year%4 == 0){
			return "12.09."+year;
		}else if(year == 1918){
			return "26.09."+year;
		}

		//그레고리력의 윤년
		if(year%4 == 0 && year%100 == 0 && year%400 == 0){
			return "12.09."+year;
		//평년
		}else if(year%4 == 0 && year%100 == 0) {
			return "13.09."+year;
		//그레고리력의 윤년
		}else if(year%4 == 0 && year%100 != 0){
			return "12.09."+year;
		}

		//평년
		return "13.09."+year;
		*/

    //sol2
    String date = "";
    if(year < 1918) {                                                   //Julian check for leap year
      date += (year % 4 == 0) ? "12.09." + year : "13.09." + year;
    } else if(year == 1918) {                                           //Special case: transition year
      date += "26.09." + year;
    } else {                                                            //Gregorian check for leap year
      date += ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) ? "12.09." + year : "13.09." + year;
    }
    return date;
  }

  public static void main(String[] args) {
    System.out.println(dayOfProgrammer(2017)+", ans: 13.09.2017");
    System.out.println(dayOfProgrammer(2016)+", ans: 12.09.2016");
    System.out.println(dayOfProgrammer(1800)+", ans: 12.09.1800");
    System.out.println(dayOfProgrammer(2100)+", ans: 13.09.2100");
    System.out.println(dayOfProgrammer(2000)+", ans: 12.09.2000");
    System.out.println(dayOfProgrammer(1918)+", ans: 26.09.1918");
  }
}
