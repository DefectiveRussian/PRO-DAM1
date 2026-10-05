import java.util.Scanner;
public class PRO01_Ejerc5 {
	public static void main(String[] args) {
		int takenSeconds;
		int convertToMinutes;
		int convertToHours;
		int convertToDays;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce the amount of seconds");
		takenSeconds = sc.nextInt();
		if (takenSeconds < 0) {
			System.out.println("Negative values are not allowed");
			System.exit(0);
		}

		convertToMinutes = takenSeconds / 60; 
		convertToHours = convertToMinutes / 60;
		convertToDays = convertToHours / 24;
		
		System.out.println("Given seconds: " + takenSeconds + "\nIn Minutes: " + convertToMinutes + " In Hours: " + convertToHours + " In Days: " + convertToDays);

		sc.close();
	}
}
