package stroganov.dmitriy.creational.builder;

public class Warrior {

    private String name;
    private int damage;

    public static Builder builder (){
        return new Builder();
    }

    static public class Builder{

        private String name;
        private int damage;

        private Builder(){

        }

         public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder damage(int damage){
            this.damage = damage;
            return this;
        }

        public Warrior build(){
            return new Warrior(this);
        }
    }

    private Warrior(Builder builder) {
        name = builder.name;
        damage = builder.damage;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                '}';
    }
}
