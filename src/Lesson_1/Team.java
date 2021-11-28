package Lesson_1;

public class Team {
    
    private String nameTeam;
    private String player1;
    private String player2;
    private String player3;
    private String player4;

    public Team(String nameTeam, String player1, String player2, String player3, String player4) {
        this.nameTeam = nameTeam;
        this.player1 = player1;
        this.player2 = player2;
        this.player3 = player3;
        this.player4 = player4;
    }

    public String toString() {
        return "Command " + nameTeam + ". Composition: " + player1 + ", " + player2 + ", " + player3 + ", " + player4;
    }

    void showResults() {
        System.out.println("The team " + nameTeam + "overcame the obstacle course");
    }
}
