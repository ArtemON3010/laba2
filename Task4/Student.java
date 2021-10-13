package Task4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private final int UID;
    private String name;
    private List<Subject> subjects;
    private List<Student> students;
    private double averageMark;

    public Student(final String name, final List<Subject> subjects, final int UID) {
        this.name = name;
        this.subjects = subjects;
        this.UID = UID;
        getAverageMark();
    }

    public int getUID() {
        return UID;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    //Here we're adding new subject to arrayList
    public boolean addSubject(final Subject subject) {
        if (subject == null) {
            return false;
        }
        if (subjects.contains(subject)) {
            return false;
        }
        subjects.add(subject);
        //getAverageMark();
        return true;
    }

    //Here we remove subject by searching its name using for-each cycle
    public boolean removeSubject(final String name) {
        if (name == null) {
            return false;
        }
        for (final Subject s : subjects) {
            if (s.getName().equals(name)) {
                subjects.remove(s);
                getAverageMark();
                return true;
            }
        }
        return false;
    }

    //Here we're getting subject mark by searching its name using for-each cycle.
    //If you enter a null subjectName,so method catch IllegalArgumentException
    public Double getSubjectMark(final String subjName) throws IllegalArgumentException {
        if (subjName == null) {
            throw new IllegalArgumentException("It must be a name here!");
        }
        for (final Subject s : subjects) {
            if (s.getName().equals(subjName)) {
                return s.getMark();
            }
        }
        return null;
    }

    //The same think,but it's setting subject mark,but we're also resetting subject mark
    public boolean setSubjectMark(final String subjName, final double mark) {
        if (subjName == null) {
            return false;
        }
        for (final Subject s : subjects) {
            if (s.getName().equals(subjName)) {
                s.setMark(mark);
                getAverageMark();
                return true;
            }
        }
        return false;
    }

    //Here,we're getting average mark by doing simple math operations,and using for-each cycle as well.
    public Double getAverageMark() {
        double markSum = 0;

        for (final Subject s : subjects) {
            markSum += s.getMark();
        }
        averageMark = markSum / subjects.size();

        return averageMark;
    }

    //Here,we're overriding method toString to display all data we need
    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder();

        result.append(name).append(" : ").append("Average grade : ").append(averageMark).append(System.lineSeparator())
                .append(" Subject grades : ").append(System.lineSeparator());
        for (final Subject s : subjects) {
            result.append(s.getName()).append(" : ").append(s.getMark()).append(System.lineSeparator());
        }

        return result.toString();
    }
}
