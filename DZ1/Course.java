package DZ1;

public  class Course {

    Barrier[] barriers  = new Barrier[4];

    public Course() {

        barriers[0] = new Barrier(1);
        barriers[1] = new Barrier(3);
        barriers[2] = new Barrier(4);
        barriers[3] = new Barrier(5);
    }

    public void doIt(Team team){
        System.out.println("\nTeam \"" + team.teamName + "\":\n");
        for (Member member: team.Members){
            for (Barrier barrier: barriers){
                if (member.jumpHigh > barrier.barrierHigh){
                    member.passedDistances++;
                }
                else {
                    System.out.println("Member " + member.memberName + " didn't pass barrier " + barrier.barrierHigh);
                    break;
                }
            }
            if (member.passedDistances == barriers.length){
                System.out.println("Member " + member.memberName  + " has passed distance with score " + member.passedDistances);
            }
        }



    }

}
