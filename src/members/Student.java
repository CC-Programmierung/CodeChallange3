package members;

import java.util.ArrayList;

public class Student {
    private String name;
    private char gender;
    private int id;
    private String course;
    private ArrayList courseList;
    private ArrayList deList;
    private ArrayList enList;

    public Student(String name, char gender, int id, String course) {
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.course = course;
        this.courseList = new ArrayList();
        this.deList = new ArrayList();
        this.enList = new ArrayList();

    }

    //Funktion für Student zu spezielles Fach hier.... funktioniert noch nicht
    public void addCourse(Student s){
        if(course == "Deutsch"){
            deList.add(s);
        }
    }

    public ArrayList getDeList() {
        return deList;
    }

    @Override
    public String toString() {
        return  name + "," + gender + "," + id + "," + course;
    }
}
