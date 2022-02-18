package courses;

import java.util.ArrayList;

//Kurst braucht Course ID !!!???

public class Course {
    private String subject;
    private String room;
    private String teacher;
    private ArrayList studentList;


    public Course(String subject, String room, String teacher) {
        this.subject = subject;
        this.room = room;
        this.teacher = teacher;
        this.studentList = new ArrayList();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public ArrayList getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return  subject + "," + room + "," + teacher;
    }
}
