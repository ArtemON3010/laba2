package Task3;

public class Student {
    private final String firstName;
    private final String lastName;
    private final Mark mark;
    private final Subject subject;

    public Student(final String firstName, final String lastName, final Subject subject, final Mark mark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.mark = mark;

    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Mark getMark() {
        return mark;
    }

    public Subject getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Student: " + "\n" + getFirstName() + " " + getLastName() + "\nEntered subject+mark:\n" + getSubject() +
                "   " + getMark();
    }


}
