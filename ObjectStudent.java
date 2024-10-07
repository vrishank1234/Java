import java.util.ArrayList;

public class StudentExample {

    public static class Student {
        private int rollNo;
        private String name;
        private String course;

        public Student(int rollNo, String name, String course) {
            this.rollNo = rollNo;
            this.name = name;
            this.course = course;
        }

        public int getRollNo() {
            return rollNo;
        }

        public String getName() {
            return name;
        }

        public String getCourse() {
            return course;
        }

        @Override
        public String toString() {
            return "Student{rollNo=" + rollNo + ", name='" + name + "', course='" + course + "'}";
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Vrish", "Mathematics"));
        students.add(new Student(2, "Manmeet", "Physics"));
        students.add(new Student(3, "Garvit", "Chemistry"));
        students.add(new Student(4, "Hanshika", "Biology"));
        students.add(new Student(5, "Roshni", "Computer Science"));

        System.out.println("Student Information:");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println("Roll No: " + student.getRollNo() + ", Name: " + student.getName() + ", Course: " + student.getCourse());
        }
    }
}
