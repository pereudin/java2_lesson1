package competitors;

public class Human implements Competitor {
    String name;
    int maxRunDistance;
    int maxSwimDistance;
    int maxJumpHeight;
    boolean active;

    public Human(String name, int maxRunDistance, int maxSwimDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.active = true;
    }

    public Human(String name) {
        this(name, 400, 15, 3);
    }

    public void run(int dist) {
        if (dist <= this.maxRunDistance) {
            System.out.println(this.name + " пробежал дистанцию");
        } else {
            System.out.println(this.name + " не смог пробежать и выбыл с соревнований");
            this.active = false;
        }

    }

    public void swim(int dist) {
        if (dist <= this.maxSwimDistance) {
            System.out.println(this.name + " проплыл дистанцию");
        } else {
            System.out.println(this.name + " не смог проплыть и выбыл с соревнований");
            this.active = false;
        }

    }

    public void jump(int height) {
        if (height <= this.maxJumpHeight) {
            System.out.println(this.name + " перепрыгнул препятствие");
        } else {
            System.out.println(this.name + " не смог перепрыгнуть и выбыл с соревнований");
            this.active = false;
        }

    }

    public boolean isOnDistance() {
        return this.active;
    }

    public void info() {
        System.out.println(this.name + " " + this.active);
    }
}
