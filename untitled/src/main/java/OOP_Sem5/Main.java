package OOP_Sem5;

import OOP_Sem5.Data.Group;
import OOP_Sem5.Data.Student;
import OOP_Sem5.Data.Teacher;
import OOP_Sem5.Data.User;
import OOP_Sem5.View.View;

import java.util.ArrayList;
import java.util.List;

public class Main {
//    Задача 1 - Data/model
//📌 Создать package – model. Работу продолжаем в нем
//📌 Реализовать абстрактный класс User и его наследники Student и Teacher.
//    Родитель имеет в себе общие данные (пример: фио, год рождения и тд), а
//    наследники собственные параметры (какие, по вашему выбору – Пример:
//            studentId для Student, teacherId для Teacher)

//    Задача 2 - Service
//📌 Создать package – service. Работу продолжаем в нем
//📌 Создать класс DataService с методами в по управлению сущностями User
//            (create, read) и агрегирующий всех пользователей заведенных в системе
//📌 StudentId должны быть созданы по алгоритму – максимальный id в
//    коллекции + 1. Аналогично и для TeacherId. Здесь решение через перебор
//    элементов и instanceOf
    public static void main(String[] args) {
        View view = new View();
        Student student1 = new Student("Петр", "Петров",
                "25.07.1997", 25); //можно User student, но тогда не обратиться к полям студента
        Student student2 = new Student("Алексей", "Павлов",
                "24.06.1997", 12);
        Student student3 = new Student("Федор", "Краснов",
                "23.05.1997", 1);

//        Teacher teacher1 = new Teacher("Ivan1", "Ivanov",
//                "25.07.1965", "IT"); //можно User teacher, но тогда не обратиться к полям учителя
//        System.out.println(student1.toString());
//        System.out.println(teacher1.toString());
        view.createGroup(new Group(new ArrayList<>(List.of(student1, student2)),
                new Teacher("Иван", "Иванов",
                        "24.02.1970", "IT"), 10));
        view.createStudent(10, "Федор", "Краснов",
                "23.05.1997", 1);
        view.printInfo();
    }
}