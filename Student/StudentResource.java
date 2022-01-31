package Student;

import java.util.*;
import java.util.Iterator;

public class StudentResource {

    public void printAllStudents(final Student[] studentArrays) {
        for (Student student : studentArrays) {
            if (Objects.nonNull(student)) {
                System.out.println(student.getFIO());
            }
        }

    }


    public static void main(String[] args) {
        StudentCollector studentCollector = new StudentCollector();
        Student studentRoma = Student.CREATE_STUDENT("Roma", "Romanov", "Romanovich");
        Student studentVova = new Student();
        studentVova.setFirstName("Vova");
        studentVova.setLastName("Vova");
        studentVova.setMiddleName("Vova");

        Student studentKate = Student.CREATE_STUDENT("Kate", "Katerin", "Katerinovna");
        Student studentOlga = Student.CREATE_STUDENT("Olga", "Olga", "Olegovna");
        Student studentOlga1 = Student.CREATE_STUDENT("Olgas", "Olgas", "Olegovnas");


        studentCollector.addNewStudent(studentRoma);
        studentCollector.addNewStudent(studentVova);
        studentCollector.addNewStudent(studentKate);
        studentCollector.addNewStudent(studentOlga);

        studentCollector.addNewStudent(studentOlga1);


       /* studentCollector.removeStudent(2);
        studentCollector.removeStudent(0);
        studentCollector.removeStudent(1);
        studentCollector.removeStudent(3);
        */


        //studentCollector.removeStudent(studentKate);
        //studentCollector.remove("studentKate");



        StudentResource studentResource = new StudentResource();

        studentResource.printAllStudents(studentCollector.getAllStudents());








    }
}
