package competitors;

public class Team {
    String nameTeam;
    Human member1;
    Cat member2;
    Dog member3;
    Fitch member4;

    public Team(String nameTeam, String nameHuman, String nameCat, String nameDog, String nameFitch) {
        this.nameTeam = nameTeam;

        member1 = new Human(nameHuman);
        member2 = new Cat(nameCat);
        member3 = new Dog(nameDog);
        member4 = new Fitch(nameFitch);
    }

    public void showResult() {
        Competitor[] competitors = {member1, member2, member3, member4};

        for (Competitor c:competitors) {
            c.info();
        }
    }

    public void infoTeam() {
        System.out.println("Наименование команды: " + nameTeam + "\n");
        System.out.println("Сотстав команды и характеристики участников:");
        System.out.println("Участник № 1: " + member1.name + " (Human)." + " Максимально может пробежать " + member1.maxRunDistance +
                " м., прыгает на " + member1.maxJumpHeight + " м. и плывет " + member1.maxSwimDistance + " м.");
        System.out.println("Участник № 2: " + member2.name + " (" + member2.type + ")." + " Максимально может пробежать " + member2.maxRunDistance +
                " м., прыгает на " + member2.maxJumpHeight + " м. и плывет " + member2.maxSwimDistance + " м.");
        System.out.println("Участник № 3: " + member3.name + " (" + member3.type + ")." + " Максимально может пробежать " + member3.maxRunDistance +
                " м., прыгает на " + member3.maxJumpHeight + " м. и плывет " + member3.maxSwimDistance + " м.");
        System.out.println("Участник № 4: " + member4.name + " (" + member4.type + ")." + " Максимально может пробежать " + member4.maxRunDistance +
                " м., прыгает на " + member4.maxJumpHeight + " м. и плывет " + member4.maxSwimDistance + " м.");
        System.out.println();
    }

    public Human getMember1() {
        return member1;
    }

    public Cat getMember2() {
        return member2;
    }

    public Dog getMember3() {
        return member3;
    }

    public Fitch getMember4() {
        return member4;
    }
}
