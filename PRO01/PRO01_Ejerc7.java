import java.util.Scanner;
public class PRO01_Ejerc7 {
    public static void main(String[] args) {
        double a;
        double b;
        double x;
        Scanner sc = new Scanner(System.in);

        System.out.println("The equasion is a * x + b = 0");

        System.out.printf("Please introduce the numerical value of a\n");
        a = sc.nextDouble();
        System.out.printf("Please introduce the numerical value of b\n");
        b = sc.nextDouble();
        System.out.printf("The equasion is %fx + %f = 0", a, b);

        b = -b / a;
        a = a / a;
        x = b * a;
        
        System.out.printf("x equals %f\n", x);
        sc.close();
    }
}
