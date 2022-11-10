package lesson1;

public class Turtle extends Animal implements CanSwim, Competitor {
    private int swimmingSpeed;

    public Turtle(String name, String color, int age, int swimmingSpeed, int maxRunDistance, int maxJumpHeight, int maxSwimDistance)  {
        super(name, color, age, maxRunDistance, maxJumpHeight, maxSwimDistance);
        this.swimmingSpeed = swimmingSpeed;
    }



    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void voice() {
        System.out.println("Черепаха издает звук!");
    }

    public double swim(Pool pool) {
        System.out.println("Я черепаха, я плыву!");
        System.out.println("Затратил " + pool.getLength() / swimmingSpeed);
        return pool.getLength() / swimmingSpeed;
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