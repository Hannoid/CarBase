package Student;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private String middleName;
    private long studentTicket; // long: хранит целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт
    private int age;
    private String sex;
    private boolean hasMilitaryTicket;
    private int studentСourse;


    private boolean isEmpty(final String value) {
        return (Objects.isNull(value) || value.trim().length() == 0);
    }


    private boolean validateName(final String name) {
        if (isEmpty(name)) return false;
        return name.replaceAll("[^0-9]", "").length() == 0;
    }

    private boolean validateTicket(final long Ticket) {
        if (Math.ceil(Math.log10(Ticket + 0.5)) == 6) {
            return true;
        }
        return false;
    }

    private boolean validateStudentСourse(int StudentСourseval) {
        if (StudentСourseval >= 0 & StudentСourseval <= 7) {
            return true;
        }
        return false;
    }

    public void setFirstName(String firstName) {
        if (!isEmpty(this.firstName)) return;
        if (validateName(firstName)) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (!isEmpty(this.lastName)) return;
        if (validateName(lastName)) {
            this.lastName = lastName;
        }
    }

    public void setMiddleName(String middleName) {
        if (!isEmpty(this.middleName)) return;
        if (validateName(middleName)) {
            this.middleName = middleName;
        }
    }

    public void setStudentTicket(long studentTicket) {
        if (validateTicket(studentTicket)) {
            this.studentTicket = studentTicket;
        } else System.out.println("если 0 значит неправильно введен номер билета");
    }

    public void setStudentСourse(int studentСourse) {
        if (validateStudentСourse(studentСourse)) {
            this.studentСourse = studentСourse;
        }

    }

    public void nextStudentCourse(int studentСourse){
        setStudentСourse(studentСourse+1);
    }






    public Student() {
    }

    private Student(String firstName, String last, String middle, long ticket) {
        setFirstName(firstName);
        setLastName(last);
        setMiddleName(middle);
        setStudentTicket(ticket);
    }

    public String getName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public long getStudentTicket() {
        return studentTicket;
    }

    public int getStudentСourse() {
        return studentСourse;
    }


    public static Student CREATE_STUDENT(String firstName, String last, String middle, long ticket) {
        return new Student(firstName, last, middle, ticket);
    }

    public String getFIO() {

        return "full fio student  firstName = " + firstName + " last name = " + lastName + " middle name = " + middleName + "   ticket = " + studentTicket;
    }
}
