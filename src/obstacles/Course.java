// выполнение пункта № 3

package obstacles;

import competitors.*;

public class Course {
    Cross cross;
    Wall wall;
    Water water;

    public Course(int crossLength, int wallHeigth, int swimmingDistance) {
        cross = new Cross(crossLength);
        wall = new Wall(wallHeigth);
        water = new Water(swimmingDistance);
    }

    public void dolt(Team team) {
        Competitor[] members = {team.getMember1(), team.getMember2(), team.getMember3(), team.getMember4()};

        Obstacle[] obstacles = {cross, wall, water};

        for (Competitor c: members) {
            for (Obstacle o:obstacles) {
                o.doIt(c);
                if(!c.isOnDistance()){
                    break;
                }
            }
        }

    }
}
