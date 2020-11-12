package BasketballGames;

import java.time.LocalDate;
import java.time.Period;

public class Human {

    //    ### 0- Human (EASY)-very member of a team has a name, birthday, age, nationality.
    private String name;
    private LocalDate birthday;
    private String nationality;
    private int age;

    public Human(String name, LocalDate birthday, String nationality, int age) {
        this.name = name;
        this.birthday = birthday;
        this.nationality = nationality;
        this.age = age;
    }


    public LocalDate getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality();
    }

    public int getAge() {
        return Period.between(birthday, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Human{" +
               "name='" + name + '\'' +
               ", birthday=" + birthday +
               ", nationality='" + nationality + '\'' +
               ", age=" + age +
               '}';
    }
}
