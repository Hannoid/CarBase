package Student;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;


public class StudentCollector {
    private Student[] studentArrays = new Student[3];
    private int currentPosition = 0;


    public void addNewStudent(final Student student) {
        if (Objects.isNull(student)) return;
        if (studentArrays.length < currentPosition + 1) {
            Student[] temp = studentArrays.clone();
            studentArrays = new Student[currentPosition * 2 + 1];
            System.arraycopy(temp, 0, studentArrays, 0, temp.length);
        }
        studentArrays[currentPosition++] = student;

    }

    public void removeStudent(int index) {
        studentArrays[index] = null;
    }

    public void removeAll() {
        for (int i = 0; i < studentArrays.length; i++) {
            studentArrays[i] = null;
        }
    }

    public void removeFirsName(String firstName) {
        for (int i = 0; i < studentArrays.length; i++) {

            if (studentArrays[i] != null && firstName != null && studentArrays[i].getName() != null && studentArrays[i].getName().equals(firstName)) {
                studentArrays[i] = null;
                System.out.println("remove " + firstName + " index= " + i);
                break;
            }

        }


    }

    public void removeTicket(long Ticket) {
        for (int i = 0; i < studentArrays.length; i++) {

            if (studentArrays[i] != null && studentArrays[i].equals(Ticket)) {
                studentArrays[i] = null;
                System.out.println("remove " + Ticket + " index= " + i);
                break;
            }

        }


    }

    public void searchStudent(String firstName) {
        for (int i = 0; i < studentArrays.length; i++) {

            if (studentArrays[i] != null && firstName != null && studentArrays[i].getName() != null && studentArrays[i].getName().equals(firstName)) {
                System.out.println("Вот ваш стдент с именем " + firstName);
                System.out.println(studentArrays[i].getFIO());
                break;
            }

        }
    }


    public void searchTicket(long Ticket) {
        for (int i = 0; i < studentArrays.length; i++) {

            if (studentArrays[i] != null && studentArrays[i].getStudentTicket() == Ticket) {
                System.out.println("Вот ваш студент по номеру " + Ticket);
                System.out.println(studentArrays[i].getFIO());
                break;
            }

        }


    }
    /*public void removeStudentName(String firstName) {
        for (int i = 0; i < studentArrays.length; i++) {
            if (studentArrays.f== firstName) {
                return i;
            }
        }
        return -1;
    }
     */


    public Student[] getAllStudents() {
        return studentArrays;
    }


}