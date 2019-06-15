import competitors.*;
import obstacles.*;

public class Main {
    public static void main(String[] args) {

        Course course = new Course(80, 2, 10);

        Team team = new Team("Stars", "Bob","Vaska", "Tuzik", "Chip");

        team.infoTeam();
        course.dolt(team);
        team.showResult();
    }
}