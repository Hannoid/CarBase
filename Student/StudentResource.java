package Student;

import java.util.*;


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
        Student studentRoma = Student.CREATE_STUDENT("Roma", "Romanov", "Romanovich", 232222);

        Student studentVova = new Student();
        studentVova.setFirstName("Vova");
        studentVova.setLastName("Vova");
        studentVova.setMiddleName("Vova");
        studentVova.setStudentTicket(1654441);
        studentVova.setStudentСourse(1);
        System.out.println("student kurs   " + studentVova.getStudentСourse());
        System.out.println(131212);
        studentCollector.nextWell("Vova","Vova");
        System.out.println("student kurs   " + studentVova.getStudentСourse());
        studentVova.nextStudentCourse(1);

        Student studentKate = Student.CREATE_STUDENT("Kate", "Katerin", "Katerinovna", 258888);
        Student studentOlga = Student.CREATE_STUDENT("Olga", "Olga", "Olegovna", 264888);
        Student studentOlga1 = Student.CREATE_STUDENT("Olga", "Olgas", "Olegovnas", 216577);

        studentCollector.addNewStudent(studentRoma);
        studentCollector.addNewStudent(studentVova);
        studentCollector.addNewStudent(studentKate);
        studentCollector.addNewStudent(studentOlga);
        studentCollector.addNewStudent(studentOlga1);
        //System.out.println(studentKate.getStudentTicket());

        StudentResource studentResource = new StudentResource();
        studentResource.printAllStudents(studentCollector.getAllStudents());
        System.out.println("asdasdasd+");

        System.out.println();

        //studentCollector.removeFirsName("Kate");
        //studentCollector.removeFirsName("Olga");
        //studentCollector.removeTicket(216577);

        studentCollector.searchStudent("Kate");
        System.out.println("remove array");
        //studentResource.printAllStudents(studentCollector.getAllStudents());
        System.out.println("");
        studentCollector.searchTicket(216577);
        studentCollector.searchTicket(264888);



        //studentCollector.searchStudent("studentKate");




        /*System.out.println("clear 1");
        studentCollector.removeStudent(0);

         */



        /*studentResource.printAllStudents(studentCollector.getAllStudents());
        studentCollector.removeAll();
        System.out.println("Clear all");
        studentResource.printAllStudents(studentCollector.getAllStudents());
        System.out.println("end Clear");

         */


    }
}
