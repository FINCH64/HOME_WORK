package src.home_work_6;

public class Person {
    private String nick;
    private String password;

    public Person(String nick, String password) {
        if (password.length() >= 5 || password.length() <= 10) {
            this.nick = nick;
            this.password = password;
        } else {
            System.out.println("Вы ввели имя не верной длинны");
        }
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getNick() {
        return nick;
    }
}
