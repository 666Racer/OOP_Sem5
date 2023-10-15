package OOP_Sem5.View;

import OOP_Sem5.Controller.Controller;
import OOP_Sem5.Data.Group;
import OOP_Sem5.Data.Student;

public class View {
    Controller controller = new Controller();
    public void createGroup(Group group){
        controller.addGroup(group);
    }

    public void createStudent(int groupID, String name, String lastName, String dateOfBirth, int studentID){
        controller.addStudent(groupID, name, lastName, dateOfBirth, studentID);
    }

    public void printInfo(){
        System.out.println(controller/*.toString()*/);
    }

}
