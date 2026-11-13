import java.util.Scanner;

// shows the multiplication table of a number 
public class Multi {
	public static void main(String[] args) {
		int n, i, result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce the number to show the table for");
		n = sc.nextInt();
		if (n > 30) {
			System.out.println("Invlaid number. The program will now close.");
			System.exit(1);
		}

		i = 1;
		System.out.println("while loop:");
		while (i < 10) {
			result = n * i;
			System.out.printf("%d x %d = %d\n", n, i, result);
			i++;
		}
		System.out.println("-----------------------");

		i = 1;
		System.out.println("do while loop:");
		do {
			result = n * i;
			System.out.printf("%d x %d = %d\n", n, i, result);
			i++;
		} while (i < 10);
		System.out.println("-----------------------");
		
		System.out.println("for loop:");
		for (i = 1; i < 10; i++) {
			result = n * i;
			System.out.printf("%d x %d = %d\n", n, i, result);
		}
		System.out.println("-----------------------");
		System.out.println("End of program");
		sc.close();
		return;
	}
}
