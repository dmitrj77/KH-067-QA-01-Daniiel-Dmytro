public class Main {
    public static class UniversityGroup {
        private String groupName;
        private int starYear;
        private int endYear;
        public static String[] studentArray = new String[]{"Misha", "Kolya"};

        public String getGroupName() {

            return groupName;
        }

        public int getStarYear() {
            return starYear;
        }

        public int getEndYear() {
            return endYear;
        }

        public void getStudentArray() {
            for (int i = 0; i < studentArray.length; i++) {
                studentArray[i] = studentArray[i];
                System.out.printf("Student: " + studentArray[i] + "\n");
            }
        }

        public UniversityGroup(String groupN, int starY) {
            starYear = starY;
            endYear = starYear + 5;
            groupName = groupN;

        }

        public UniversityGroup(String groupN, int starY, String[] Array) {
            starYear = starY;
            endYear = starYear + 5;
            groupName = groupN;
            studentArray = Array;

        }

        public void setaddStudent(String[] studentArray) {

            if (this.studentArray[0] == (null)) {
                this.studentArray[0] = studentArray[0];
            } else {
                System.out.printf("Array is not empty");
            }
        }

        public void getGroupDescription(String[] studentArray) {
            groupName = getGroupName();
            starYear = getStarYear();
            endYear = getEndYear();
            for (int i = 0; i < studentArray.length; i++) {
                studentArray[i] = studentArray[i];
                System.out.printf("\nStudent: " + studentArray[i] + " Group: " + groupName +
                        " StartYear: " + starYear + " endYear: " + endYear + "\n");
            }
        }

        public static void main(String[] args) {
            //String[] studentArray = new String[4];
            String[] students = new String[]{"Petya Petrov"};
            UniversityGroup obj1 = new UniversityGroup("123", 2019);
            obj1.setaddStudent(students);
            obj1.getGroupDescription(studentArray);
            UniversityGroup obj2 = new UniversityGroup("124", 2020, studentArray);
            obj2.setaddStudent(students);
            obj2.getGroupDescription(studentArray);
            obj2.getStudentArray();
        }
    }
}


