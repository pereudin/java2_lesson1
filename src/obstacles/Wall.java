package obstacles;

import competitors.Competitor;

public class Wall extends Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    public void doIt(Competitor competitor) {
        competitor.jump(this.height);
    }
}
