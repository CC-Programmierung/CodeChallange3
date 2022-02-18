package office;

import courses.Course;
import members.Student;

import java.util.ArrayList;

public class HeadOffice {

    private ArrayList studentList;
    private ArrayList courseList;
    private ArrayList deList;
    private ArrayList enList;

    public HeadOffice() {
        this.studentList = new ArrayList();
        this.courseList = new ArrayList();
        this.deList = new ArrayList();
        this.enList = new ArrayList();
    }

    public void addToDeLessen(Student s){
        deList.add(s);
    }

    public void addStudent(Student s){
        studentList.add(s);
    }

    public void addCourse(Course c){
        courseList.add(c);
    }

    public ArrayList getStudentList() {
        return studentList;
    }

    public ArrayList getCourseList() {
        return courseList;
    }


}
