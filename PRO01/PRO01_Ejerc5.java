import java.util.Scanner;
public class PRO01_Ejerc5 {
    public static void main(String[] args) {
        int takenNumber;
        int convertToMinutes;
        int convertToHours;
        int convertToDays;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce the amount of seconds");
        takenNumber = sc.nextInt();
        convertToMinutes = takenNumber / 60;
        convertToHours = convertToMinutes / 60;
        convertToDays = convertToHours / 24;
        
        if (takenNumber == 0 || takenNumber > 0)
            System.out.println("Given seconds: " + takenNumber + "\nIn Minutes: " + convertToMinutes + " In Hours: " + convertToHours + " In Days: " + convertToDays);
        else if (takenNumber < 0)
            System.out.println("Negative values are not allowed");
        else
            System.out.println("Incorrect value");
        sc.close();
    }
}
