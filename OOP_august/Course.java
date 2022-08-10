package OOP_august;

public class Course {

    Obstacle[] obstacles =  new Obstacle[2];

    public Course () {

        obstacles[0] = new Obstacle("Jumping", 25);
        obstacles[1] = new Obstacle("Running", 32);
    }

    public void doIt (Team team){
        System.out.println("Команда - " + team.TeamName + " проходит дистанцию!");

        for ( int i=0; i < team.members.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {

                if (team.members[i].power >= obstacles[j].difficulty) {
                    System.out.println(team.members[i].name + " прошел " + obstacles[j].OpName);
                    team.members[i].passedDistances++;
                } else {
                    System.out.println(team.members[i].name + " не прошел " + obstacles[j].OpName);
                }
            }
        }

        for ( int i=0; i < team.members.length; i++) {
            if (team.members[i].passedDistances == obstacles.length) {
                team.members[i].finished = true;
            } else {
                team.members[i].finished = false;
            }
        }


    }
}
