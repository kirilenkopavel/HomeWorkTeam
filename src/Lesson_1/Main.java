package Lesson_1;

public class Main {

    public static void main(String[] args) {
        Team team1 = new Team("QA", "Vasya", "Petya", "Egor", "Dima");
        System.out.println(team1);

        Course c = new Course(500, 100);

        c.doCourse();

        if (c.doCourse() == true) {
            team1.showResults();
        }





    }
}
