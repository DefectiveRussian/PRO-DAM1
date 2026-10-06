//import java.util.Scanner;
public class PRO01_Ejerc8 {
	public static void main(String[] args) {
        double proAlumnos = 10;
        double entAlumnos = 25;
        double basAlumnos= 0;

        if (proAlumnos > 30 || entAlumnos > 30 || basAlumnos > 30) {
            System.out.println("A course can't have more than 30 students!");
            System.exit(1); //change to 1 in ex05 too
        }
    }
}
