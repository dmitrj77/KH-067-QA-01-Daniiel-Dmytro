public class Main {
    public static class UniversityGroup {
        private  String groupName;
        private  int starYear;
        private int endYear;
        public  String[] studentArray = new String[]{};

        public  String getGroupName() {

            return groupName;
        }

        public  int getStarYear() {
            return starYear;
        }

        public  int getEndYear() {
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

        public  void addStudent(String[] students) {
            int index = 0;
            for (int i = 0; i < studentArray.length; i++) {
                if (studentArray[i] == (null) && index < students.length) {
                    studentArray[i] = students[index];
                    index++;
                }
            }
        }

        public void getGroupDescription(String[] studentArray) {
            groupName = getGroupName();
            starYear = getStarYear();
            endYear = getEndYear();
            for (int i = 0; i < studentArray.length; i++) {
                studentArray[i] = studentArray[i];
                System.out.printf("Student: " + studentArray[i] + " Group: " + groupName + " StartYear: " + starYear + " endYear: "
                        + endYear + "\n");
            }
        }
        public static void main(String[] args) {
            String[] studentArray = new String[9];
            String[] students = new String[]{"Petya Petrov", "Misha Misha", "Ivan Ivanov", "Kolya Nikol"};
            UniversityGroup obj1 = new UniversityGroup("123", 2019);
            obj1.addStudent(students);
            obj1.getGroupDescription(studentArray);
            UniversityGroup obj2 = new UniversityGroup("124", 2020, studentArray);
            obj2.addStudent(students);
            obj2.getGroupDescription(studentArray);
            obj2.getStudentArray();
        }
    }
}
<<<<<<< HEAD
=======

>>>>>>> 5f81e993d53c67e545dc8437d4634f8e1f920eca
