import java.util.Scanner;
public class PRO01_Ejerc5 {
	public static void main(String[] args) {
		final int takenSeconds;
		final int aDay = 86400;
		final int anHour = 3600;
		final int aMinute = 60;
		int convertToDays;
		int convertToHours;
		int convertToMinutes;
		int convertToSeconds;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce the amount of seconds");
		takenSeconds = sc.nextInt();
		if (takenSeconds < 0) {
			System.out.println("Negative values are not allowed");
			System.exit(0);
		}

		//how to calculate without %
		convertToDays = takenSeconds / aDay;
		convertToHours = (takenSeconds - convertToDays * aDay) / anHour;
		convertToMinutes = (takenSeconds - convertToDays * aDay - convertToHours * anHour) / aMinute;
		convertToSeconds = takenSeconds - convertToDays * aDay - convertToHours * anHour - convertToMinutes * aMinute;

		//how to calculate with %
		/*convertToDays = takenSeconds / aDay;
		convertToHours = (takenSeconds % aDay) / anHour;
		convertToMinutes = */

		//System.out.println("Given seconds: " + takenSeconds + "\nDays: " + convertToDays + " Hours: " + convertToHours + " Minutes: " + convertToMinutes);
		
		System.out.println("Given seconds: " + takenSeconds + "\nDays: " + convertToDays + " Hours: " + convertToHours + " Minutes: " + convertToMinutes + " Seconds: " + convertToSeconds);

		sc.close();
	}
}
