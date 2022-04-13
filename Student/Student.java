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

    private boolean isEmpty(final String value) {
        return (Objects.isNull(value) || value.trim().length() == 0);
    }

    private boolean validateName(final String name) {
        if (isEmpty(name)) return false;
        return name.replaceAll("[^0-9]", "").length() == 0;
    }
    private boolean validateTicket(final long ticket) {
        if (isEmpty(ticket)) return false;
        return ticket.replaceAll("[^0-9]", "").length() == 0;
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


    public void setstudentTicket(long studentTicket) {
        if (!isEmpty(this.studentTicket)) return;
        if (validateTicket(studentTicket)) {
            this.studentTicket = studentTicket;
        }
    }


    public Student() {
    }

    private Student(String firstName, String last, String middle, long ticket) {
        setFirstName(firstName);
        setLastName(last);
        setMiddleName(middle);
        setstudentTicket(ticket);
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

    public static String getName(Student student) {
        return student.firstName;
    }

    public static Student CREATE_STUDENT(String firstName, String last, String middle) {
        return new Student(firstName, last, middle);
    }

    public String getFIO() {
        return "full fio student  firstName = " + firstName + " last name = " + lastName + " middle name = " + middleName;
    }
}
