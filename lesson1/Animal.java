package lesson1;

public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;
    String type;
    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;

    boolean onDistance;


    public Animal(String name, String color, int age,int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void voice();

    public void doIt(Competitor com) {
    }
}
