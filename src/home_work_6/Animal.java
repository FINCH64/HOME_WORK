package src.home_work_6;

public class Animal {
    private String age;
    private String nick;

    public Animal(String age, String nick) {

        if (Integer.parseInt (age) >= 1 || Integer.parseInt (age) <= 15) {
            this.age = age;
            this.nick = nick;
        } else {
            System.out.println("Вы ввели не верный возраст.");
        }
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }
}
