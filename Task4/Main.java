package Task4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private List<Student> students = new ArrayList<>();

    public static void main(final String[] args) {
        final Main main = new Main();
        final List<Subject> subjects0 = new ArrayList<>();
        subjects0.add(new Subject("English", 90));
        subjects0.add(new Subject("Maths", 74));
        subjects0.add(new Subject("Physic", 51));

        final List<Subject> subjects1 = new ArrayList<>();
        subjects1.add(new Subject("English", 99));
        subjects1.add(new Subject("Maths", 95));
        subjects1.add(new Subject("Physic", 98));

        final Student Artem = new Student("Artem", subjects0, 1);
        final Student Ivan = new Student("Ivan", subjects1, 2);

        main.students.add(Artem);
        main.students.add(Ivan);

        main.students.get(0).setSubjectMark("English", 99);
        main.students.get(0).setSubjectMark("Maths", 98);
        main.students.get(0).setSubjectMark("Physic", 97);

        main.students.get(1).setSubjectMark("English", 51);
        main.students.get(1).setSubjectMark("Maths", 60);
        main.students.get(1).setSubjectMark("Physic", 80);

        main.printAllStudents();
        main.addSubjectToAll(new Subject("Programming"));
        main.students.get(0).setSubjectMark("Programming", 70);
        main.students.get(1).setSubjectMark("Programming", 55);

        main.printAllStudents();

        System.out.println("Highest average : " + main.findGreatestAverageMark());
        System.out.println(main.formMap("Maths"));
    }

    //Here,we're adding new subject using for-each cycle
    private void addSubjectToAll(final Subject subject) {
        for(final Student s : students) {
            s.addSubject(new Subject(subject.getName(), subject.getMark()));
        }
    }

    //Here,we're printing all students using for-each cycle
    private void printAllStudents() {
        for(final Student s : students) {
            System.out.println(s);
        }
    }

    //Here,we're finding greatest average mark by comparing with first student average mark
    private Student findGreatestAverageMark() {
        Student result = students.get(0);

        for (final Student s : students) {
            if(s.getAverageMark() > result.getAverageMark()) {
                result = s;
            }
        }
        return result;
    }

    //We use this method to print all students who study certain subject and to present their UID+grade of this certain
    // subject.If there are no students studying certain subject,so method catch IllegalArgumentException
    private Map<Integer,Double> formMap(final String subjectName) {
        final Map<Integer,Double> result = new HashMap<>();
        try {
            for (final Student s : students) {
                result.put(s.getUID(), s.getSubjectMark(subjectName));
            }
        } catch (final IllegalArgumentException ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
