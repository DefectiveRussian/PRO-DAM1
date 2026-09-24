public class Enumerated {
    public enum Days {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday};

    public static void main(String[] args) {
        Days currentDay = Days.Thursday;
        Days nextDay = Days.Friday;

        System.out.print("Today is: ");
        System.out.println(currentDay);
        System.out.println("Tomorrow\nis\n" + nextDay);
    }
}
