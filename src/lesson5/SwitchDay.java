package lesson5;

public class SwitchDay {
    public static void main(String[] args) {
        //  int i = Integer.parseInt(args[0]);
        switch (args[0]) {
            case "1":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            case "3":
                System.out.println("Wednesday");
                break;
            case "4":
                System.out.println("Thursday");
                break;
            case "5":
                System.out.println("Friday");
                break;
            case "6":
            case "7":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Incorrect number");


        }
    }
}
