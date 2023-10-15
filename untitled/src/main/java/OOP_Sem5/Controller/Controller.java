package OOP_Sem5.Controller;

import OOP_Sem5.Data.Group;
import OOP_Sem5.Data.Student;
import OOP_Sem5.Data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Controller {
//    private Student student = new Student();
//    private Teacher teacher = new Teacher();
    private static List<Group> stream = new ArrayList<>();

    public void addGroup(Group group){
        stream.add(group);
    }

    public static void setStream(List<Group> stream) {
        Controller.stream = stream;
    }

    public static List<Group> getStream() {
        return stream;
    }

    public static Group getGroupByID(int groupID){
        for (Group group: stream) {
            if (group.getGroupID() == groupID){
                return group;
            }
        }
        System.out.println("Такой группы нет!");
        return null;
    }

    public void addStudent(int groupID, String name, String lastName, String dateOfBirth, int studentID){
        getGroupByID(groupID).addStudent(new Student (name, lastName, dateOfBirth, studentID));
    }

    public void addTeacherToGroup(int groupID, String name, String lastName, String dateOfBirth, String discipline){
        getGroupByID(groupID).createTeacher(name, lastName, dateOfBirth, discipline);
    }

    @Override
    public String toString() {
        return "Controller{" +
                "stream=" + stream +
                "}";
    }
}
