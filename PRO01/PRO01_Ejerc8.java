import java.util.Scanner;
public class PRO01_Ejerc8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int proStudents;
		int etsStudents;
		int baeStudents;

		System.out.println("Introduce the amount of students in PRO");
		proStudents = sc.nextInt();
		System.out.println("Introduce the amount of students in ETS");
		etsStudents = sc.nextInt();
		System.out.println("Introduce the amount of students in BAE");
		baeStudents = sc.nextInt();

		double total = proStudents + etsStudents + baeStudents;

		if (proStudents > 30 || etsStudents > 30 || baeStudents > 30) {
			System.out.println("A course can't have more than 30 students!");
			System.exit(1);
		}
		else if (proStudents < 0 || etsStudents < 0 || baeStudents < 0) {
			System.out.println("Negative numbers are not allowed!");
			System.exit(1);
		}

		System.out.println("Students in PRO: " + ((proStudents / total) * 100) + "%\nStudents in ETS: " + ((etsStudents / total) * 100) + "%\nStudents in BAE: " + ((baeStudents / total) * 100) + "%");
		sc.close();
	}
}
