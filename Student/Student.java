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

    /*private boolean isEmptyTicket(final long value) {
        return (Objects.isNull(value)|| value.trim().length() == 0);
    }

     */

    private boolean validateName(final String name) {
        if (isEmpty(name)) return false;
        return name.replaceAll("[^0-9]", "").length() == 0;
    }

    private boolean validateTicket(final long Ticket) {
        //if (isEmptyTicket(Ticket)) return false;
        if (Math.ceil(Math.log10(Ticket + 0.5)) == 6) {
            return true;
        }
        //String studentTicketString = Long.toString(studentTicket);
        //return studentTicketString.replaceAll("[^A-Z]", "").length() == 0;
        //Long studentTicketString = Long.valueOf(studentTicketString);

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
        //if (!isEmptyTicket(this.studentTicket)) return;
        if (validateTicket(studentTicket)) {
          this.studentTicket = studentTicket;
        }
        else System.out.println("если 0 значит неправильно введен номер билета");
        /*if (!isEmptyTicket(this.studentTicket)) return;
        if (validateTicket(studentTicket)) {
            this.studentTicket = studentTicket;
        }

         */
        //this.studentTicket = studentTicket;

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


    public static String getName(Student student) {
        return student.firstName;
    }

    public static Student CREATE_STUDENT(String firstName, String last, String middle, long ticket) {
        return new Student(firstName, last, middle, ticket);
    }

    public String getFIO() {
        //String studentTicketString = Long.toString(studentTicket);
        return "full fio student  firstName = " + firstName + " last name = " + lastName + " middle name = " + middleName + "   ticket = " + studentTicket;
    }
}
