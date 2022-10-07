//Question 3.3

//package co.cg.time;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.*;
//import java.time.LocalDate;
//import java.time.Period;
//
//class Time {
//		public static void main(String args[]) {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("yyyy-mm-dd");
//			String str = sc.nextLine();
//			LocalDate today = LocalDate.now();
//			LocalDate userDate = LocalDate.parse(str);
//			Period p = Period.between(userDate,today);
//			
//			
//			System.out.println(p.getDays());
//			System.out.println(p.getMonths());
//			System.out.println(p.getYears());
//		}
//}









//Question 3.4

//import java.time.LocalDate;
//import java.time.Period;
//public class Time {
//   public static void main(String[] args) {
//      LocalDate date1 = LocalDate.of(2019, 3, 25);
//      LocalDate date2 = LocalDate.of(2019, 4, 29);
//      System.out.println("Date 1 = "+date1);
//      System.out.println("Date 2 = "+date2);
//      Period p = Period.between(date1, date2);
//      System.out.println("Period = "+p);
//      System.out.println("Years (Difference) = "+p.getYears());
//      System.out.println("Month (Difference) = "+p.getMonths());
//      System.out.println("Days (Difference) = "+p.getDays());
//   }
//}