package competitors;

public class Animal implements Competitor {
    String type;
    String name;
    int maxRunDistance;
    int maxSwimDistance;
    int maxJumpHeight;
    boolean onDistance;

    public Animal(String type, String name, int maxRunDistance, int maxSwimDistance, int maxJumpHeight) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    public void run(int dist) {
        if (dist <= this.maxRunDistance) {
            System.out.println(this.type + " " + this.name + " пробежал дистанцию");
        } else {
            System.out.println(this.type + " " + this.name + " не смог пробежать и выбыл с соревнований");
            this.onDistance = false;
        }

    }

    public void swim(int dist) {
        if (dist <= this.maxSwimDistance) {
            System.out.println(this.type + " " + this.name + " проплыл дистанцию");
        } else {
            System.out.println(this.type + " " + this.name + " не смог проплыть и выбыл с соревнований");
            this.onDistance = false;
        }

    }

    public void jump(int height) {
        if (height <= this.maxJumpHeight) {
            System.out.println(this.type + " " + this.name + " перепрыгнул препятствие");
        } else {
            System.out.println(this.type + " " + this.name + " не смог перепрыгнуть и выбыл с соревнований");
            this.onDistance = false;
        }

    }

    public boolean isOnDistance() {
        return this.onDistance;
    }

    public void info() {
        System.out.println(this.type + " " + this.name + " " + this.onDistance);
    }
}
