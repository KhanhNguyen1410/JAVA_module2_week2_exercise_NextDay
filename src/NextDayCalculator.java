public class NextDayCalculator {

    public static String nextDay(int day, int month, int year) {

        if (checkMonth31Day(month)) {
            day++;
            if (day > 31) {
                day = 1;
                month++;
                if (month > 12){
                    month = 1;
                    year++;
                }
            }
        }else if (month == 2 && isLeapYear(year)){
            day++;
            if (day > 29){
                day = 1;
                month++;
            }
        } else if (month == 2 && !isLeapYear(year)){
            day++;
            if (day>28){
                day=1;
                month++;
            }
        }
        else{
            if (month !=2){
                day++;
                if (day > 30){
                    day=1;
                    month++;
                }
            }
        }
      return  day + "/" + month + "/"+ year;
    }
    public static boolean isLeapYear(int year){
        boolean division4 = year % 4== 0;
        boolean division100 = year % 100== 0;
        boolean division400 = year % 400== 0;

        if (division4){
            if (division100){
                if (division400){
                    return true;
                }
            }
            else return true;
        }
        return false;
    }
    public static boolean checkMonth31Day(int month){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return true;
        }
        return false;
    }
}
