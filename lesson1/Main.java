package lesson1;

import static lesson1.Utils.makeAnimalOlder;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", "белый", 1, 0, 0, 0);

        System.out.println(cat1);

        Cat cat2 = new Cat("Морис", "black", 1, 0, 0, 0);

        Cat cat3 = new Cat("Морис", "black", 1, 0, 0, 0);

        System.out.println(cat2.equals(cat3));

        Wolf wolf = new Wolf("Тревор", "Серый", 6, 0, 0, 0);

        Animal cat4 = new Cat("Морис", "red", 10, 0, 0, 0);

        System.out.println("Не является волком!");

        Animal cat6 = new Cat("Морис", "red", 10, 0, 0, 0);
        cat6.voice();

        //Создать набор бассейнов и заставить животных проплыть по ним и вывести время на заплыв

        Cat catCompetitor1 = new Cat("Морис", "red", 10, 0, 0, 0);
        catCompetitor1.setSwimmingSpeed(10);
        Wolf wolfCompetitor1 = new Wolf("Волк", "серый", 12, 0, 0, 0);
        wolfCompetitor1.setSwimmingSpeed(12);
        Turtle turtleCompetitor = new Turtle("Черепаха", "зеленая", 100, 0, 0, 0, 0);
        turtleCompetitor.setSwimmingSpeed(15);

        Pool[] pools = {new Pool(15), new Pool(20), new Pool(35)};

        for (Pool pool : pools) {
            pool.getTimeToOvercomePool(catCompetitor1);
            pool.getTimeToOvercomePool(wolfCompetitor1);
            pool.getTimeToOvercomePool(turtleCompetitor);
        }

        makeAnimalOlder(cat2);

        Course a; // Создаем полосу препятствий
        a = new Course(new Barrier.Cross(80), new Barrier.Water(3), new Barrier.Wall(5));
        Team team = new Team("Герои", new Wolf("Джони", "серый", 15, 5, 5, 3), new Cat("Мурзик", "белый", 10, 3, 10, 25), new Turtle("Тони", "зеленый", 100, 25, 10, 5, 10)); // Создаем команду
        a.doIt(team); // Просим команду пройти полосу

        System.out.println("\nWinners:");
        team.passedTheDistance();

        System.out.println("\nResult:");// Показываем результаты
        team.showResults();

        Competitor[] competitors = {new Cat("Мурзик", "белый", 10, 85, 10, 25), new Wolf("Джони", "серый", 15, 5, 5, 3), new Turtle("Тони", "зеленый", 100, 25, 10, 5, 10)};
        Barrier[] barriers = {new Barrier.Cross(80), new Barrier.Wall(5), new Barrier.Water(3)};

        for (Competitor c : competitors) {
            for (Barrier b : barriers) {
                b.doIt(c);
                if (!c.isOnDistance()) {
                    break;
                }
            }
        }
        for (Competitor c : competitors) {
            c.info();
        }
    }
}
