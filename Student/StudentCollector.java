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



    /*public void removeStudent(Student student) {
        studentArrays(student) = null;


    }

     */




    public Student[] getAllStudents() {
        return studentArrays;
    }



}