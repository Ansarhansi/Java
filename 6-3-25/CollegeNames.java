public class CollegeNames {
    static int index = 0;
    static String[] collegeNames = {null, null, null, null};

    public static void addCollege(String name) {
        if (collegeNames != null) {
            if (index < collegeNames.length) {
                collegeNames[index] = name;
                index++;
                System.out.println("College added successfully");
            } else {
                System.out.println("List is full, cannot add");
            }
        } else {
            System.out.println("collegeNames is null");
        }
    }

    public static void displayColleges() {
        for (String college : collegeNames) {
            System.out.println(college);
        }
    }
}