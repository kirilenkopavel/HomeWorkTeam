package Lesson_1;

public class Course {

    private int run;
    private int swim;

    public Course(int run, int swim) {
        this.run = run;
        this.swim = swim;
    }

    public boolean doCourse() {
        return true;
    }

    public String toString() {
        return "Run: " + run + "Smimming: " + swim;
    }
}
