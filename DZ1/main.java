package DZ1;

import Practice.Cat;

public class main {

    public static void main(String[] args) {
      Team team1 = new Team("MyTeam");

      team1.membersInfo();

      Course course1 = new Course();

      course1.doIt(team1);


      Team team2 = new Team("Team 2");

      team2.Members[1].memberName = "David";
      team2.Members[2].memberName = "Petr";

      course1.doIt(team2);

    }

}
