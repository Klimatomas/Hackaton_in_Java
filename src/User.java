import java.util.Calendar;

class User {
    private int year;
    private String firstName;
    private String lastName;
    private String nickname;

    User(int year, String firstName, String lastName) {
        this.year = year;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = makeUsername();
    }


    static boolean checkAge(int year) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return (currentYear - year > 18);
    }

    private String makeUsername() {
        System.out.printf("%s%s\n", firstName.substring(0, 2), lastName.substring(0, 2));
        return firstName.substring(0, 2) + lastName.substring(0, 2);
    }

    void printUser() {
        System.out.printf("Welcome! Here are your credentials:\nFirst Name: %s\nLast Name: %s\nNickname: %s\nYear of Birth: %s", firstName, lastName, nickname, year);
    }
}