package OOP_Sem5.Data;

public class Student extends User{
    /*private*/ int studentID;

    public Student(String name, String lastName, String dateOfBirth, int studentID) {
        super(name, lastName, dateOfBirth);
        this.studentID = studentID;
    }

//    public Student() {
//    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
