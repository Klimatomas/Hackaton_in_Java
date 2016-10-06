import java.util.Calendar;

class User {
    private int year;
    private String firstname;
    private String lastname;
    private String nickname;

    User(int year, String firstname, String lastname) {
        this.year = year;
        this.firstname = firstname;
        this.lastname = lastname;
        this.nickname = makeUsername();
    }


    static boolean checkAge(int year) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return (currentYear - year > 18);
    }

    private String makeUsername() {
        System.out.printf("%s%s\n", firstname.substring(0, 2), lastname.substring(0, 2));
        nickname = firstname.substring(0, 2) + lastname.substring(0, 2);
        return nickname;
    }

    void printUser() {
        System.out.printf("Welcome! Here are your credentials:\nFirst Name: %s\nLast Name: %s\nNickname: %s\nYear of Birth: %s", firstname, lastname, nickname, year);
    }
}