package obstacles;

import competitors.Competitor;

public class Water extends Obstacle {
    int length;

    public Water(int length) {
        this.length = length;
    }

    public void doIt(Competitor competitor) {
        competitor.swim(this.length);
    }
}