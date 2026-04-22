package stroganov.dmitriy.structural.flyweight;

public class Minion {

    private String name;
    private String age;
    private MinionType minionType;

    public Minion(String name, String age, MinionType minionType) {
        this.name = name;
        this.age = age;
        this.minionType = minionType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public MinionType getMinionType() {
        return minionType;
    }

    public void setMinionType(MinionType minionType) {
        this.minionType = minionType;
    }
}
