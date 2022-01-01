//https://leetcode.com/problems/day-of-the-week/
import java.util.Date;
import java.util.Calendar;
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, day);
        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case 1 : return "Sunday";
            case 2 : return "Monday";
            case 3 : return "Tuesday";
            case 4 : return "Wednesday";
            case 5 : return "Thursday";
            case 6 : return "Friday";
            case 7 : return "Saturday";
        }
        return null;
    }
}
/*
import java.util.Date;
import java.util.Calendar;
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int m = (month+10)%12;
        if(m==0)
        {m=12;
        year--;
        }
        if(m==11)
            year--;
        int D = year%100;
        int C = year/100;
        System.out.println(day+" "+m+" "+C+" "+D);
        int f = day + ((13*m-1)/5) +D+ (D/4) +(C/4)-2*C;
        
        f=f%7;
        if(f<0)
            f=7+f;
        System.out.println(f);
        switch (f%7) {
            case 0 : return "Sunday";
            case 1 : return "Monday";
            case 2 : return "Tuesday";
            case 3 : return "Wednesday";
            case 4 : return "Thursday";
            case 5 : return "Friday";
            case 6 : return "Saturday";
        }
        return null;
    }
   
}
*/

/*
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
                
        int days = 0;
        
        for (int i = 1971; i < year; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                days += 366;
            } else {
                days += 365;
            }
        
        }
                
        boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        for (int i = 1; i < month; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8
                    || i == 10 || i == 12) {
                days += 31;
            } else if (i == 2) {
                if (leap) {
                    days += 29;
                } else {
                    days += 28;
                }
            } else {
                days += 30;
            }
        }
        
        days += day;
        
        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", 
                         "Thursday", "Friday", "Saturday"};
        
        return week[(days + 4) % 7];
    }
}
*/
/*
class Solution {
    static boolean isLeapYear(int n) {
        if(n%100 == 0) {
            return n%400 == 0;
        }
        return n%4 == 0;
    }
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] months = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int[] years = {0, 6, 4, 2, 0, 6, 4, 2}; // 1500 - 2299 [(year/100)-15]
        if(isLeapYear(year)) {
            months[0] = -1;
            months[1] = 2;
        }
        int r = ((year%100) + ((year%100)/4) + day + months[month-1] + years[(year/100)-15]) % 7;
        
        return days[r];
    }
}
*/
