import java.util.Scanner;
public class PRO1_Ejerc4 { //give monthly salary, say if it matches minimum interpersonal wage (1221 euro/month)
    public static void main(String[] args) {
        final int minWage = 1221;
        int takenWage;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce your monthly wage in numbers");
        takenWage = sc.nextInt();
        if (takenWage == minWage || takenWage > minWage)
            System.out.printf("Your monthly wage of %d euro is compliant with the minumum interpersonal wage of Spain (%d euro per month)\n", takenWage, minWage);
        else
            System.out.printf("Your monthly wage of %d euro is NOT compliant with the minumum interpersonal wage of Spain (%d euro per month)\n", takenWage, minWage);
        sc.close();
    }
}
