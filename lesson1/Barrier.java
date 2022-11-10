package lesson1;

public class Barrier {

    public void doIt(Competitor com) {
    }

    static class Wall extends Barrier {
        int height;

        public Wall(int height) {
            this.height = height;
        }

        @Override
        public void doIt(Competitor competitor) {
            competitor.jump(height);
        }
    }

    static class Water extends Barrier {
        int length;

        public Water(int length) {
            this.length = length;
        }

        @Override
        public void doIt(Competitor competitor) {
            competitor.swim(length);
        }
    }

    static class Cross extends Barrier {
        int length;

        public Cross(int length) {
            this.length = length;
        }

        @Override
        public void doIt(Competitor competitor) {
            competitor.run(length);
        }
    }
}