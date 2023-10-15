package OOP_Sem5.Data;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Student> studentsList;
    private Student student = new Student();
    private Teacher teacher = new Teacher();
    private int groupID;

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public Group(ArrayList<Student> studentsList, Teacher teacher, int groupID) {
        this.studentsList = studentsList;
        this.groupID = groupID;
        this.teacher = teacher;
    }

    public Group() {};

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public void addStudent(Student student){
        this.studentsList.add(student);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void createStudent(String name, String lastName, String dateOfBirth, int studentID){
        student.setStudentID(studentID);
        student.setName(name);
        student.setLastName(lastName);
        student.setDateOfBirth(dateOfBirth);
        //studentsList.add(student);
    }

    public void createTeacher(String name, String lastName, String dateOfBirth, String discipline){
        teacher.setDiscipline(discipline);
        teacher.setName(name);
        teacher.setLastName(lastName);
        teacher.setDateOfBirth(dateOfBirth);
    }

    @Override
    public String toString() {
        return "Group{" +
                "studentsList=" + studentsList +
                ", teacher=" + teacher +
                ", groupID=" + groupID +
                '}';
    }
}
