package lesson1;

import java.util.Objects;

public class Cat extends Animal implements CanSwim, Competitor {
    private boolean isWild;
    private double swimmingSpeed;

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public Cat(String name, String color, int age,int maxRunDistance, int maxJumpHeight, int maxSwimDistance ) {
        super(name, color, age, maxRunDistance, maxJumpHeight, maxSwimDistance);
        this.name = name;
        this.color = color;
        this.age = age;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
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
        if (age < 0) {
            System.out.println("Некорректное значение!");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name) &&
                Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age);
    }

    public void voice() {
        System.out.println("Кот мяукает!");
    }

    public double swim(Pool pool) {
        System.out.println("Я кот, я плыву!");
        double timeToOvercome = pool.getLength() / swimmingSpeed;
        System.out.println(timeToOvercome);
        return timeToOvercome;
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.println(type + " " + name + " successfully ran");
        } else {
            System.out.println(type + " " + name + " failed ran");
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if (dist <= maxSwimDistance) {
            System.out.println(type + " " + name + " successfully swam");
        } else {
            System.out.println(type + " " + name + " failed swimming");
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(type + " " + name + " successfully jump");
        } else {
            System.out.println(type + " " + name + " failed jump");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.println(type + " " + name + " " + onDistance);
    }
}
