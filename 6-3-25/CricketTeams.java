
public class CricketTeams {
    static int index = 0;
    static String[] teamNames = {null, null, null, null};

    public static void addTeam(String name) {
        if (teamNames != null) {
            if (index < teamNames.length) {
                teamNames[index] = name;
                index++;
                System.out.println("Team added successfully");
            } else {
                System.out.println("List is full, cannot add");
            }
        } else {
            System.out.println("teamNames is null");
        }
    }

    public static void displayTeams() {
        for (String team : teamNames) {
            System.out.println(team);
        }
    }
}






