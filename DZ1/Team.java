package DZ1;

public class Team {
    String teamName;

    public Member[] Members = new Member[4];

    public Team(String teamName) {
        this.teamName = teamName;
       Members[0] = new Member("Viktor", 30);
       Members[1] = new Member("Vladimir", 50);
       Members[2] = new Member("Alex", 40);
       Members[3] = new Member("John", 2);
    }

    public void membersInfo (){
        for (int i = 0; i < Members.length; i++) {
            System.out.println("Member name " + Members[i].memberName + "Jump high " + Members[i].jumpHigh);
        }
    }

}
