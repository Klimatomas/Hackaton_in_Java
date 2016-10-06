import java.util.Calendar;

class User {
    private int year;
    private String firstName;
    private String lastName;
    private String nickname;

    User(int year, String firstname, String lastname) {
        this.year = year;
        this.firstName = firstname;
        this.lastName = lastname;
        this.nickname = makeUsername();
        printUser();
    }


    static boolean checkAge(int year) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if (currentYear - year < 18) {
            System.out.print("You must be over  18 to access this website.");
            System.exit(0);
        }
        return true;
    }

    private String makeUsername() {
        System.out.printf("%s%s\n", firstName.substring(0, 2), lastName.substring(0, 2));
        nickname = firstName.substring(0, 2) + lastName.substring(0, 2);
        return nickname;
    }

    private void printUser() {
        System.out.printf("Welcome! Here are your credentials:\nFirst Name: %s\nLast Name: %s\nNickname: %s\nYear of Birth: %s", firstName, lastName, nickname, year);
    }
}