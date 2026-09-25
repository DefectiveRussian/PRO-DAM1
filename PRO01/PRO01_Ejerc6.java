import java.util.Scanner;
public class PRO01_Ejerc6 {
    public enum Dogs {Mastin, Terrier, Bulldog, Pekines, Caniche, Galgo}
    public static void main(String[] args) {
        int choice;
        Dogs perro1 = Dogs.Pekines;
        Dogs perro2 = Dogs.Terrier;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 1 to see the result with println or 2 for printf");
        choice = sc.nextInt();

        if (choice == 1)
            System.out.println("perro1 is: " + perro1 + ". perro2 is: " + perro2 + ".");
        else if (choice == 2)
            System.out.printf("perro1 is: %s. perro2 is: %s.\n", perro1, perro2);
        else
            System.out.println("Incorrect value");
        sc.close();
    }
}
