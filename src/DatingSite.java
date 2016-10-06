
import java.util.Scanner;

class DatingSite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.println("Please enter your year of birth:");

        do {
            try {
                String s = input.nextLine();
                year = Integer.parseInt(s);
                break;
            } catch (NumberFormatException e) {
                System.out.println("You must enter a number!");
            }
        }
        while (true);

        if (!User.checkAge(year)) {
            System.out.println("You must be over  18 to visit this website!");
            return;
        }

        System.out.println("Please enter your first name:");
        String firstName = input.next();

        System.out.println("Please enter your surname");
        String lastName = input.next();

        User user = new User(year, firstName, lastName);
        user.printUser();
    }
}
