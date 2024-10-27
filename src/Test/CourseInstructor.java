package Test;


class Instructor{
    private String instructorName;

    public Instructor(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    @Override
    public String toString() {
        return  instructorName;
    }
}

class Course{
     private String courseCode;
     private String courseName;
     private Instructor instructor;

    public Course(String courseCode, String courseName, Instructor instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseCode='" + courseCode + '\'' +
                ", courseName='" + courseName + '\'' +
                ", instructor=" + instructor +
                '}';
    }
}
public class CourseInstructor {
    public static void main(String[] args) {
        Instructor I1 = new Instructor("Jagannath Bhandari");
        Course c1 = new Course("Java36","Java",I1);
        System.out.println("Course Code         "+c1.getCourseCode());
        System.out.println("Course Name         "+c1.getCourseName());
        System.out.println("Course Instructor   "+c1.getInstructor());
    }
}
