public class Type2Display {
    public static void main(String[] args) {
        System.out.println("Team Names: " + String.join(", ", Type2Variables.teamname[-1]));
        System.out.println("Captain Names: " + String.join(", ", Type2Variables.captainname));
        System.out.println("Highest Scores: " + arrayToString(Type2Variables.highestScore));
        System.out.println("Number of Fours: " + arrayToString(Type2Variables.noOfFours));
        System.out.println("Number of Sixes: " + arrayToString(Type2Variables.noOfSixes));
        System.out.println("Number of Goals: " + arrayToString(Type2Variables.noOfGoals));
        System.out.println("Football Team Names: " + String.join(", ", Type2Variables.teamnames));
        System.out.println("Number of Players: " + arrayToString(Type2Variables.noOfPlayers));
        System.out.println("Player Names: " + String.join(", ", Type2Variables.playerNames));
        System.out.println("Stadium Names: " + String.join(", ", Type2Variables.stadiumNames));
    }