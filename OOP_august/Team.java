package OOP_august;

import java.net.SocketOption;

public class Team {
    public String TeamName;

    Member[] members =  new Member[4];

    public Team (String name) {

        this.TeamName = name;
        members[0] = new Member("Vasya", 30);
        members[1] = new Member("Igor", 37);
        members[2] = new Member("Andrey", 28);
        members[3] = new Member("Eugen", 35);
    }

    public void TeamMembersInfo () {
        /*for (int i = 0; i < members.length; i++) {
            System.out.println("��� ����� ������� - " + members[i].name + ". ���� ����� ������� - " + members[i].power);
        }*/
        for (Member m : members) {
            System.out.println("��� ����� ������� - " + m.name + ". ���� ����� ������� - " + m.power);
        }

    }

    public void showResults() {
        System.out.println("����������: ");
        /*for (int i = 0; i < members.length; i++) {
            if (members[i].finished == true){
                System.out.println("��������� ������ ���������: " + members[i].name);
            }
        }*/

        for (Member m : members) {
            if (m.finished == true){
                System.out.println("��������� ������ ���������: " + m.name);
            }
        }

    }



}
