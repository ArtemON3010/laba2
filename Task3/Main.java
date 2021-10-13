package Task3;

public class Main {
    public static void main(final String[] args) {
        final Subject subject1 = new Subject("Math");

        final Mark mark1 = new Mark(5);

        final Student student1 = new Student("Petro", "Petrenko", subject1, mark1);

        System.out.println(student1);
    }
}
