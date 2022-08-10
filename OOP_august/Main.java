package OOP_august;

public class Main {


    public static void main(String[] args) {
            Team team1 = new Team("Ракета");
            team1.TeamMembersInfo();

            Course course1 = new Course();

            course1.doIt(team1);

            team1.showResults();
    }


}
