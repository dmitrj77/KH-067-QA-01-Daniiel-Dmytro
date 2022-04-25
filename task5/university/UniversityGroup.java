package university;

public class UniversityGroup {
    private static String groupName;
    private static int starYear;
    private static int endYear;
    public static String[] studentArray = new String[]{};

    public String getgroupName() {

        return groupName;
    }

    public int getStarYear() {
        return starYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public static String getStudentArray() {
        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i] = studentArray[i];
            System.out.printf("Student: " + studentArray[i] + "\n");
        }
        return String.valueOf(studentArray);
    }

    public UniversityGroup(String groupName, int starYear) {
        this.starYear = starYear;
        this.endYear = starYear + 5;
        this.groupName = groupName;

    }

    public UniversityGroup(String groupName, int starYear, String[] studentArray) {
        this.starYear = starYear;
        this.endYear = starYear + 5;
        this.groupName = groupName;
        this.studentArray = studentArray;

    }

    public static void addStudent(String[] students) {

        if (studentArray.length >= students.length) {
            for (int i = 0; i < students.length; i++) {
                if (studentArray[i] == (null)) {
                    studentArray[i] = students[i];
                }
            }
        } else {
            for (int i = 0; i < studentArray.length; i++) {
                if (studentArray[i] == (null)) {
                    studentArray[i] = students[i];
                }
            }
        }
    }

    public static void getGroupDescription(String[] studentArray) {
        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i] = studentArray[i];
            System.out.printf("Student: " + studentArray[i] + " Group: " + groupName + " StartYear: " + starYear + " endYear: "
                    + endYear + "\n");
        }
    }

    public static void main(String[] args) {
        String[] studentArray = new String[6];
        String[] students = new String[5];
        UniversityGroup obj1 = new UniversityGroup("123", 1992);
        obj1.addStudent(students);
        getGroupDescription(studentArray);
        UniversityGroup obj2 = new UniversityGroup("124", 1992, studentArray);
        students = new String[]{"Petya", "Misha", "Vasya", "Grisha"};
        obj2.addStudent(students);
        getGroupDescription(studentArray);
        students = new String[]{"1", "2", "3", "4", "5"};
        obj2.addStudent(students);
        getGroupDescription(studentArray);
        UniversityGroup.getStudentArray();
    }
}
