package honux.calendar;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] arg) {
		print();
		System.out.println("달을 입력하시오");
		Scanner scanner = new Scanner(System.in);
		int monthu = scanner.nextInt();
		int dayu = dayofmonth(monthu);
		System.out.printf("month %d has %d days\n", monthu, dayu);
		
		//teacher's example
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.printf("%d월은 %d일까지 있습니다.\n", monthu, days[monthu-1]);
		
	}
	public static void print() {
		System.out.println(" 월  화   수   목   금   토   일");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}
	
	public static int dayofmonth(int month) {
		int day = 0;
		if (month == 1 || month ==3 || month ==5 || month ==7 || month ==8 || month ==10 || month ==12) {
			day = 31;
		}
		else if(month == 2) {
			day = 28;
		}
		else {
			day = 30;
		}
		return day;
	}
	

}
