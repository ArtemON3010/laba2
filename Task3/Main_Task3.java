package Task3;

public class Main_Task3 {
    public static void main(final String[] args) {
        final Student_Task3 student1 = new Student_Task3(19,"Артем", "IT-21", "ІКНІ",new Rating_Task3(85),
                new Subject_Task3("Фізра"));
        final Student_Task3 student2 = new Student_Task3(20,"Олег", "БД-41", "ІБІС",new Rating_Task3(80),
                new Subject_Task3("Проектування"));
        final Student_Task3 student3 = new Student_Task3(18,"Ян", "КБ-21", "ІКТА",new Rating_Task3(90),
                new Subject_Task3("Кібербезпека"));

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        final Rating_Task3 someRating = new Rating_Task3(99);
        System.out.println(someRating);
        final Subject_Task3 someSubject = new Subject_Task3("ТІМС",4);
        System.out.println(someSubject);



    }
}
