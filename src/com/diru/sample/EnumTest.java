package com.diru.sample;

public class EnumTest {
	Day day;

	public EnumTest(Day day) { this.day = day;	}

	public void tellItLikeItIs() {

		switch (day){
		case MONDAY:
			System.out.println("Mondays are bad!");
			break;

		case FRIDAY:
			System.out.println("Fridays are okay");
			break;

		case SATURDAY:
			System.out.println("Saturdays are Caturdays");
			break;

		case SUNDAY:
			System.out.println("SUNDAY FUNDAY");
			break;
			
		default:
			System.out.println("So-so la the day");
			break;
			
		}
	}

	public static void main (String args[]){
		EnumTest firstDay = new EnumTest(Day.MONDAY);
		firstDay.tellItLikeItIs();
		EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
		thirdDay.tellItLikeItIs();
		EnumTest fifthDay = new EnumTest(Day.FRIDAY);
		fifthDay.tellItLikeItIs();
		EnumTest sixthDay = new EnumTest(Day.SATURDAY);
		sixthday.tellItLikeItIs();
		EnumTest seventhDay = new EnumTest(Day.SUNDAY);
		seventh.tellItLikeItIs();
		
		
	}

}