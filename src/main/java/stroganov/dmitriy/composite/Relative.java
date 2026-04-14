package stroganov.dmitriy.composite;

import java.time.LocalDate;

public class Relative {

    protected String name;
    protected LocalDate birthday;

    public Relative(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String info(){
        return name+"/"+birthday.toString()+"\n";
    }
}
