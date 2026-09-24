package Ejercicio1;
public class PRO01_Ejerc1 {
    public enum Choice {M, F};
    public static void main(String[] args) {
        
        final int MAX_NUMBER = 5000;
        boolean driversLicense = true;
        String fullName = "Deniel Khamidullin Barabanshchikov";
        Choice sex = Choice.M; 
        int earthToJupiter = 777908928;

        System.out.println("Unmodifiable Max Value: " + MAX_NUMBER);

            if (driversLicense == true)
                System.out.println("Has a drivers license");
            else
                System.out.println("Does not have a drivers license");

        System.out.println("Full Name: " + fullName);
        System.out.println("Sex: " + sex);
        System.out.printf("Approx. distance from Earth to Jupiter: %d km\n", earthToJupiter);
    }
}
